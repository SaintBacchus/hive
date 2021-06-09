<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class FindSchemasByColsResp
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'schemaVersions',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SchemaVersionDescriptor',
                ),
        ),
    );

    /**
     * @var \metastore\SchemaVersionDescriptor[]
     */
    public $schemaVersions = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['schemaVersions'])) {
                $this->schemaVersions = $vals['schemaVersions'];
            }
        }
    }

    public function getName()
    {
        return 'FindSchemasByColsResp';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->schemaVersions = array();
                        $_size1024 = 0;
                        $_etype1027 = 0;
                        $xfer += $input->readListBegin($_etype1027, $_size1024);
                        for ($_i1028 = 0; $_i1028 < $_size1024; ++$_i1028) {
                            $elem1029 = null;
                            $elem1029 = new \metastore\SchemaVersionDescriptor();
                            $xfer += $elem1029->read($input);
                            $this->schemaVersions []= $elem1029;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('FindSchemasByColsResp');
        if ($this->schemaVersions !== null) {
            if (!is_array($this->schemaVersions)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('schemaVersions', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->schemaVersions));
            foreach ($this->schemaVersions as $iter1030) {
                $xfer += $iter1030->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

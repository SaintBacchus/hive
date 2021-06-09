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

class GetRuntimeStatsRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'maxWeight',
            'isRequired' => true,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'maxCreateTime',
            'isRequired' => true,
            'type' => TType::I32,
        ),
    );

    /**
     * @var int
     */
    public $maxWeight = null;
    /**
     * @var int
     */
    public $maxCreateTime = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['maxWeight'])) {
                $this->maxWeight = $vals['maxWeight'];
            }
            if (isset($vals['maxCreateTime'])) {
                $this->maxCreateTime = $vals['maxCreateTime'];
            }
        }
    }

    public function getName()
    {
        return 'GetRuntimeStatsRequest';
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
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->maxWeight);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->maxCreateTime);
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
        $xfer += $output->writeStructBegin('GetRuntimeStatsRequest');
        if ($this->maxWeight !== null) {
            $xfer += $output->writeFieldBegin('maxWeight', TType::I32, 1);
            $xfer += $output->writeI32($this->maxWeight);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->maxCreateTime !== null) {
            $xfer += $output->writeFieldBegin('maxCreateTime', TType::I32, 2);
            $xfer += $output->writeI32($this->maxCreateTime);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

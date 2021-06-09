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

class ColumnStatisticsData
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'booleanStats',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\BooleanColumnStatsData',
        ),
        2 => array(
            'var' => 'longStats',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\LongColumnStatsData',
        ),
        3 => array(
            'var' => 'doubleStats',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\DoubleColumnStatsData',
        ),
        4 => array(
            'var' => 'stringStats',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\StringColumnStatsData',
        ),
        5 => array(
            'var' => 'binaryStats',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\BinaryColumnStatsData',
        ),
        6 => array(
            'var' => 'decimalStats',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\DecimalColumnStatsData',
        ),
        7 => array(
            'var' => 'dateStats',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\DateColumnStatsData',
        ),
        8 => array(
            'var' => 'timestampStats',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\TimestampColumnStatsData',
        ),
    );

    /**
     * @var \metastore\BooleanColumnStatsData
     */
    public $booleanStats = null;
    /**
     * @var \metastore\LongColumnStatsData
     */
    public $longStats = null;
    /**
     * @var \metastore\DoubleColumnStatsData
     */
    public $doubleStats = null;
    /**
     * @var \metastore\StringColumnStatsData
     */
    public $stringStats = null;
    /**
     * @var \metastore\BinaryColumnStatsData
     */
    public $binaryStats = null;
    /**
     * @var \metastore\DecimalColumnStatsData
     */
    public $decimalStats = null;
    /**
     * @var \metastore\DateColumnStatsData
     */
    public $dateStats = null;
    /**
     * @var \metastore\TimestampColumnStatsData
     */
    public $timestampStats = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['booleanStats'])) {
                $this->booleanStats = $vals['booleanStats'];
            }
            if (isset($vals['longStats'])) {
                $this->longStats = $vals['longStats'];
            }
            if (isset($vals['doubleStats'])) {
                $this->doubleStats = $vals['doubleStats'];
            }
            if (isset($vals['stringStats'])) {
                $this->stringStats = $vals['stringStats'];
            }
            if (isset($vals['binaryStats'])) {
                $this->binaryStats = $vals['binaryStats'];
            }
            if (isset($vals['decimalStats'])) {
                $this->decimalStats = $vals['decimalStats'];
            }
            if (isset($vals['dateStats'])) {
                $this->dateStats = $vals['dateStats'];
            }
            if (isset($vals['timestampStats'])) {
                $this->timestampStats = $vals['timestampStats'];
            }
        }
    }

    public function getName()
    {
        return 'ColumnStatisticsData';
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
                    if ($ftype == TType::STRUCT) {
                        $this->booleanStats = new \metastore\BooleanColumnStatsData();
                        $xfer += $this->booleanStats->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRUCT) {
                        $this->longStats = new \metastore\LongColumnStatsData();
                        $xfer += $this->longStats->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->doubleStats = new \metastore\DoubleColumnStatsData();
                        $xfer += $this->doubleStats->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRUCT) {
                        $this->stringStats = new \metastore\StringColumnStatsData();
                        $xfer += $this->stringStats->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRUCT) {
                        $this->binaryStats = new \metastore\BinaryColumnStatsData();
                        $xfer += $this->binaryStats->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRUCT) {
                        $this->decimalStats = new \metastore\DecimalColumnStatsData();
                        $xfer += $this->decimalStats->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::STRUCT) {
                        $this->dateStats = new \metastore\DateColumnStatsData();
                        $xfer += $this->dateStats->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::STRUCT) {
                        $this->timestampStats = new \metastore\TimestampColumnStatsData();
                        $xfer += $this->timestampStats->read($input);
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
        $xfer += $output->writeStructBegin('ColumnStatisticsData');
        if ($this->booleanStats !== null) {
            if (!is_object($this->booleanStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('booleanStats', TType::STRUCT, 1);
            $xfer += $this->booleanStats->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->longStats !== null) {
            if (!is_object($this->longStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('longStats', TType::STRUCT, 2);
            $xfer += $this->longStats->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->doubleStats !== null) {
            if (!is_object($this->doubleStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('doubleStats', TType::STRUCT, 3);
            $xfer += $this->doubleStats->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->stringStats !== null) {
            if (!is_object($this->stringStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('stringStats', TType::STRUCT, 4);
            $xfer += $this->stringStats->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->binaryStats !== null) {
            if (!is_object($this->binaryStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('binaryStats', TType::STRUCT, 5);
            $xfer += $this->binaryStats->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->decimalStats !== null) {
            if (!is_object($this->decimalStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('decimalStats', TType::STRUCT, 6);
            $xfer += $this->decimalStats->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->dateStats !== null) {
            if (!is_object($this->dateStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('dateStats', TType::STRUCT, 7);
            $xfer += $this->dateStats->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->timestampStats !== null) {
            if (!is_object($this->timestampStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('timestampStats', TType::STRUCT, 8);
            $xfer += $this->timestampStats->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}

<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>lorawan.DLSettings</code>
 */
class DLSettings extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint32 rx1_dr_offset = 1 [(.gogoproto.customname) = "Rx1DROffset"];</code>
     */
    private $rx1_dr_offset = 0;
    /**
     * Generated from protobuf field <code>uint32 rx2_dr = 2 [(.gogoproto.customname) = "Rx2DR"];</code>
     */
    private $rx2_dr = 0;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>uint32 rx1_dr_offset = 1 [(.gogoproto.customname) = "Rx1DROffset"];</code>
     * @return int
     */
    public function getRx1DrOffset()
    {
        return $this->rx1_dr_offset;
    }

    /**
     * Generated from protobuf field <code>uint32 rx1_dr_offset = 1 [(.gogoproto.customname) = "Rx1DROffset"];</code>
     * @param int $var
     * @return $this
     */
    public function setRx1DrOffset($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx1_dr_offset = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 rx2_dr = 2 [(.gogoproto.customname) = "Rx2DR"];</code>
     * @return int
     */
    public function getRx2Dr()
    {
        return $this->rx2_dr;
    }

    /**
     * Generated from protobuf field <code>uint32 rx2_dr = 2 [(.gogoproto.customname) = "Rx2DR"];</code>
     * @param int $var
     * @return $this
     */
    public function setRx2Dr($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx2_dr = $var;

        return $this;
    }

}


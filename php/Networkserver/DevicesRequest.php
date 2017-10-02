<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/networkserver/networkserver.proto

namespace Networkserver;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>networkserver.DevicesRequest</code>
 */
class DevicesRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Device address from the uplink message
     *
     * Generated from protobuf field <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    private $dev_addr = '';
    /**
     * Frame counter from the uplink message
     *
     * Generated from protobuf field <code>uint32 f_cnt = 2;</code>
     */
    private $f_cnt = 0;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Networkserver\Networkserver::initOnce();
        parent::__construct();
    }

    /**
     * Device address from the uplink message
     *
     * Generated from protobuf field <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     * @return string
     */
    public function getDevAddr()
    {
        return $this->dev_addr;
    }

    /**
     * Device address from the uplink message
     *
     * Generated from protobuf field <code>bytes dev_addr = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     * @param string $var
     * @return $this
     */
    public function setDevAddr($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_addr = $var;

        return $this;
    }

    /**
     * Frame counter from the uplink message
     *
     * Generated from protobuf field <code>uint32 f_cnt = 2;</code>
     * @return int
     */
    public function getFCnt()
    {
        return $this->f_cnt;
    }

    /**
     * Frame counter from the uplink message
     *
     * Generated from protobuf field <code>uint32 f_cnt = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setFCnt($var)
    {
        GPBUtil::checkUint32($var);
        $this->f_cnt = $var;

        return $this;
    }

}


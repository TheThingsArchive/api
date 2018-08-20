<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/discovery/discovery.proto

namespace Discovery;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>discovery.GetByGatewayIDRequest</code>
 */
class GetByGatewayIDRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * compatible with Metadata message
     *
     * Generated from protobuf field <code>string gateway_id = 30 [(.gogoproto.customname) = "GatewayID"];</code>
     */
    private $gateway_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $gateway_id
     *           compatible with Metadata message
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Discovery\Discovery::initOnce();
        parent::__construct($data);
    }

    /**
     * compatible with Metadata message
     *
     * Generated from protobuf field <code>string gateway_id = 30 [(.gogoproto.customname) = "GatewayID"];</code>
     * @return string
     */
    public function getGatewayId()
    {
        return $this->gateway_id;
    }

    /**
     * compatible with Metadata message
     *
     * Generated from protobuf field <code>string gateway_id = 30 [(.gogoproto.customname) = "GatewayID"];</code>
     * @param string $var
     * @return $this
     */
    public function setGatewayId($var)
    {
        GPBUtil::checkString($var, True);
        $this->gateway_id = $var;

        return $this;
    }

}


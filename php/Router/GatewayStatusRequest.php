<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/router/router.proto

namespace Router;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * message GatewayStatusRequest is used to request the status of a gateway from
 * this Router
 *
 * Generated from protobuf message <code>router.GatewayStatusRequest</code>
 */
class GatewayStatusRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string gateway_id = 1;</code>
     */
    protected $gateway_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $gateway_id
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Router\Router::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string gateway_id = 1;</code>
     * @return string
     */
    public function getGatewayId()
    {
        return $this->gateway_id;
    }

    /**
     * Generated from protobuf field <code>string gateway_id = 1;</code>
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


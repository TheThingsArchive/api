<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/discovery/discovery.proto

namespace Discovery;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>discovery.GetByAppEUIRequest</code>
 */
class GetByAppEUIRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * compatible with Metadata message
     *
     * Generated from protobuf field <code>bytes app_eui = 31;</code>
     */
    protected $app_eui = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $app_eui
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
     * Generated from protobuf field <code>bytes app_eui = 31;</code>
     * @return string
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * compatible with Metadata message
     *
     * Generated from protobuf field <code>bytes app_eui = 31;</code>
     * @param string $var
     * @return $this
     */
    public function setAppEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_eui = $var;

        return $this;
    }

}


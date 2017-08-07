<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>lorawan.DeviceIdentifier</code>
 */
class DeviceIdentifier extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
     * </pre>
     *
     * <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    private $app_eui = '';
    /**
     * <pre>
     * The DevEUI is a unique, 8 byte identifier for the device.
     * </pre>
     *
     * <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    private $dev_eui = '';

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Device::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
     * </pre>
     *
     * <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * <pre>
     * The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
     * </pre>
     *
     * <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public function setAppEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_eui = $var;
    }

    /**
     * <pre>
     * The DevEUI is a unique, 8 byte identifier for the device.
     * </pre>
     *
     * <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    public function getDevEui()
    {
        return $this->dev_eui;
    }

    /**
     * <pre>
     * The DevEUI is a unique, 8 byte identifier for the device.
     * </pre>
     *
     * <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    public function setDevEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_eui = $var;
    }

}


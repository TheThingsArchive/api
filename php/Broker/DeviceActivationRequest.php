<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/broker/broker.proto

namespace Broker;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * received from the Router
 *
 * Generated from protobuf message <code>broker.DeviceActivationRequest</code>
 */
class DeviceActivationRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes payload = 1;</code>
     */
    protected $payload = '';
    /**
     * Generated from protobuf field <code>.protocol.Message message = 2;</code>
     */
    protected $message = null;
    /**
     * Generated from protobuf field <code>bytes dev_eui = 11;</code>
     */
    protected $dev_eui = '';
    /**
     * Generated from protobuf field <code>bytes app_eui = 12;</code>
     */
    protected $app_eui = '';
    /**
     * Generated from protobuf field <code>.protocol.RxMetadata protocol_metadata = 21;</code>
     */
    protected $protocol_metadata = null;
    /**
     * Generated from protobuf field <code>.gateway.RxMetadata gateway_metadata = 22;</code>
     */
    protected $gateway_metadata = null;
    /**
     * Generated from protobuf field <code>.protocol.ActivationMetadata activation_metadata = 23;</code>
     */
    protected $activation_metadata = null;
    /**
     * Generated from protobuf field <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
     */
    private $downlink_options;
    /**
     * Generated from protobuf field <code>.trace.Trace trace = 41;</code>
     */
    protected $trace = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $payload
     *     @type \Protocol\Message $message
     *     @type string $dev_eui
     *     @type string $app_eui
     *     @type \Protocol\RxMetadata $protocol_metadata
     *     @type \Gateway\RxMetadata $gateway_metadata
     *     @type \Protocol\ActivationMetadata $activation_metadata
     *     @type \Broker\DownlinkOption[]|\Google\Protobuf\Internal\RepeatedField $downlink_options
     *     @type \Trace\Trace $trace
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Broker\Broker::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes payload = 1;</code>
     * @return string
     */
    public function getPayload()
    {
        return $this->payload;
    }

    /**
     * Generated from protobuf field <code>bytes payload = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setPayload($var)
    {
        GPBUtil::checkString($var, False);
        $this->payload = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.protocol.Message message = 2;</code>
     * @return \Protocol\Message
     */
    public function getMessage()
    {
        return $this->message;
    }

    /**
     * Generated from protobuf field <code>.protocol.Message message = 2;</code>
     * @param \Protocol\Message $var
     * @return $this
     */
    public function setMessage($var)
    {
        GPBUtil::checkMessage($var, \Protocol\Message::class);
        $this->message = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes dev_eui = 11;</code>
     * @return string
     */
    public function getDevEui()
    {
        return $this->dev_eui;
    }

    /**
     * Generated from protobuf field <code>bytes dev_eui = 11;</code>
     * @param string $var
     * @return $this
     */
    public function setDevEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_eui = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes app_eui = 12;</code>
     * @return string
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * Generated from protobuf field <code>bytes app_eui = 12;</code>
     * @param string $var
     * @return $this
     */
    public function setAppEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_eui = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.protocol.RxMetadata protocol_metadata = 21;</code>
     * @return \Protocol\RxMetadata
     */
    public function getProtocolMetadata()
    {
        return $this->protocol_metadata;
    }

    /**
     * Generated from protobuf field <code>.protocol.RxMetadata protocol_metadata = 21;</code>
     * @param \Protocol\RxMetadata $var
     * @return $this
     */
    public function setProtocolMetadata($var)
    {
        GPBUtil::checkMessage($var, \Protocol\RxMetadata::class);
        $this->protocol_metadata = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gateway.RxMetadata gateway_metadata = 22;</code>
     * @return \Gateway\RxMetadata
     */
    public function getGatewayMetadata()
    {
        return $this->gateway_metadata;
    }

    /**
     * Generated from protobuf field <code>.gateway.RxMetadata gateway_metadata = 22;</code>
     * @param \Gateway\RxMetadata $var
     * @return $this
     */
    public function setGatewayMetadata($var)
    {
        GPBUtil::checkMessage($var, \Gateway\RxMetadata::class);
        $this->gateway_metadata = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.protocol.ActivationMetadata activation_metadata = 23;</code>
     * @return \Protocol\ActivationMetadata
     */
    public function getActivationMetadata()
    {
        return $this->activation_metadata;
    }

    /**
     * Generated from protobuf field <code>.protocol.ActivationMetadata activation_metadata = 23;</code>
     * @param \Protocol\ActivationMetadata $var
     * @return $this
     */
    public function setActivationMetadata($var)
    {
        GPBUtil::checkMessage($var, \Protocol\ActivationMetadata::class);
        $this->activation_metadata = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getDownlinkOptions()
    {
        return $this->downlink_options;
    }

    /**
     * Generated from protobuf field <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
     * @param \Broker\DownlinkOption[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setDownlinkOptions($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Broker\DownlinkOption::class);
        $this->downlink_options = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.trace.Trace trace = 41;</code>
     * @return \Trace\Trace
     */
    public function getTrace()
    {
        return $this->trace;
    }

    /**
     * Generated from protobuf field <code>.trace.Trace trace = 41;</code>
     * @param \Trace\Trace $var
     * @return $this
     */
    public function setTrace($var)
    {
        GPBUtil::checkMessage($var, \Trace\Trace::class);
        $this->trace = $var;

        return $this;
    }

}


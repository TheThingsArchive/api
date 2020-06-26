<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/discovery/discovery.proto

namespace Discovery;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The Announcement of a service (also called component)
 *
 * Generated from protobuf message <code>discovery.Announcement</code>
 */
class Announcement extends \Google\Protobuf\Internal\Message
{
    /**
     * The ID of the component
     *
     * Generated from protobuf field <code>string id = 1 [(.gogoproto.customname) = "ID"];</code>
     */
    protected $id = '';
    /**
     * The name of the component (router/broker/handler)
     *
     * Generated from protobuf field <code>string service_name = 2;</code>
     */
    protected $service_name = '';
    /**
     * Service version in the form "[version]-[commit] ([build date])"
     *
     * Generated from protobuf field <code>string service_version = 3;</code>
     */
    protected $service_version = '';
    /**
     * Description of the component
     *
     * Generated from protobuf field <code>string description = 4;</code>
     */
    protected $description = '';
    /**
     * URL with documentation or more information about this component
     *
     * Generated from protobuf field <code>string url = 5;</code>
     */
    protected $url = '';
    /**
     * Indicates whether this service is part of The Things Network (the public community network)
     *
     * Generated from protobuf field <code>bool public = 6;</code>
     */
    protected $public = false;
    /**
     * Comma-separated network addresses in the form "domain1:port,domain2:port,domain3:port" (currently we only use the first)
     *
     * Generated from protobuf field <code>string net_address = 11;</code>
     */
    protected $net_address = '';
    /**
     * ECDSA public key of this component
     *
     * Generated from protobuf field <code>string public_key = 12;</code>
     */
    protected $public_key = '';
    /**
     * TLS Certificate for gRPC on net_address (if TLS is enabled)
     *
     * Generated from protobuf field <code>string certificate = 13;</code>
     */
    protected $certificate = '';
    /**
     * Contains the address where the HTTP API is exposed (if there is one).
     * Format of api_address: `http(s)://domain(:port)`
     * default http port is 80, default https port is 443.
     *
     * Generated from protobuf field <code>string api_address = 14;</code>
     */
    protected $api_address = '';
    /**
     * Contains the address where the MQTT API is exposed (if there is one)
     * Format of mqtt_address: `(mqtt(s)://)host(:port)`
     * default mqtt port is 1883, default mqtts port is 8883.
     * Examples:
     * if `host:port` then `mqtt://host:port`
     * if `host:8883` then `mqtts://host:8883`
     * if `host` then `mqtt://host:1883` and `mqtts://host:8883`
     * if `mqtt://host` then `mqtt://host:1883`
     * if `mqtts://host` then `mqtt://host:1883` and `mqtts://host:8883`
     *
     * Generated from protobuf field <code>string mqtt_address = 15;</code>
     */
    protected $mqtt_address = '';
    /**
     * Contains the address where the AMQP API is exposed (if there is one)
     * Format of amqp_address: `(amqp(s)://)host(:port)`
     * default amqp port is 5672, default amqps port is 5671.
     * Examples:
     * if `host:port` then `amqp://host:port`
     * if `host:5671` then `amqps://host:5671`
     * if `host` then `amqp://host:5672` and `amqps://host:5671`
     * if `amqp://host` then `amqp://host:5672`
     * if `amqps://host` then `amqp://host:5672` and `amqps://host:5671`
     *
     * Generated from protobuf field <code>string amqp_address = 16;</code>
     */
    protected $amqp_address = '';
    /**
     * Metadata for this component
     *
     * Generated from protobuf field <code>repeated .discovery.Metadata metadata = 22;</code>
     */
    private $metadata;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $id
     *           The ID of the component
     *     @type string $service_name
     *           The name of the component (router/broker/handler)
     *     @type string $service_version
     *           Service version in the form "[version]-[commit] ([build date])"
     *     @type string $description
     *           Description of the component
     *     @type string $url
     *           URL with documentation or more information about this component
     *     @type bool $public
     *           Indicates whether this service is part of The Things Network (the public community network)
     *     @type string $net_address
     *           Comma-separated network addresses in the form "domain1:port,domain2:port,domain3:port" (currently we only use the first)
     *     @type string $public_key
     *           ECDSA public key of this component
     *     @type string $certificate
     *           TLS Certificate for gRPC on net_address (if TLS is enabled)
     *     @type string $api_address
     *           Contains the address where the HTTP API is exposed (if there is one).
     *           Format of api_address: `http(s)://domain(:port)`
     *           default http port is 80, default https port is 443.
     *     @type string $mqtt_address
     *           Contains the address where the MQTT API is exposed (if there is one)
     *           Format of mqtt_address: `(mqtt(s)://)host(:port)`
     *           default mqtt port is 1883, default mqtts port is 8883.
     *           Examples:
     *           if `host:port` then `mqtt://host:port`
     *           if `host:8883` then `mqtts://host:8883`
     *           if `host` then `mqtt://host:1883` and `mqtts://host:8883`
     *           if `mqtt://host` then `mqtt://host:1883`
     *           if `mqtts://host` then `mqtt://host:1883` and `mqtts://host:8883`
     *     @type string $amqp_address
     *           Contains the address where the AMQP API is exposed (if there is one)
     *           Format of amqp_address: `(amqp(s)://)host(:port)`
     *           default amqp port is 5672, default amqps port is 5671.
     *           Examples:
     *           if `host:port` then `amqp://host:port`
     *           if `host:5671` then `amqps://host:5671`
     *           if `host` then `amqp://host:5672` and `amqps://host:5671`
     *           if `amqp://host` then `amqp://host:5672`
     *           if `amqps://host` then `amqp://host:5672` and `amqps://host:5671`
     *     @type \Discovery\Metadata[]|\Google\Protobuf\Internal\RepeatedField $metadata
     *           Metadata for this component
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Discovery\Discovery::initOnce();
        parent::__construct($data);
    }

    /**
     * The ID of the component
     *
     * Generated from protobuf field <code>string id = 1 [(.gogoproto.customname) = "ID"];</code>
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * The ID of the component
     *
     * Generated from protobuf field <code>string id = 1 [(.gogoproto.customname) = "ID"];</code>
     * @param string $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkString($var, True);
        $this->id = $var;

        return $this;
    }

    /**
     * The name of the component (router/broker/handler)
     *
     * Generated from protobuf field <code>string service_name = 2;</code>
     * @return string
     */
    public function getServiceName()
    {
        return $this->service_name;
    }

    /**
     * The name of the component (router/broker/handler)
     *
     * Generated from protobuf field <code>string service_name = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setServiceName($var)
    {
        GPBUtil::checkString($var, True);
        $this->service_name = $var;

        return $this;
    }

    /**
     * Service version in the form "[version]-[commit] ([build date])"
     *
     * Generated from protobuf field <code>string service_version = 3;</code>
     * @return string
     */
    public function getServiceVersion()
    {
        return $this->service_version;
    }

    /**
     * Service version in the form "[version]-[commit] ([build date])"
     *
     * Generated from protobuf field <code>string service_version = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setServiceVersion($var)
    {
        GPBUtil::checkString($var, True);
        $this->service_version = $var;

        return $this;
    }

    /**
     * Description of the component
     *
     * Generated from protobuf field <code>string description = 4;</code>
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Description of the component
     *
     * Generated from protobuf field <code>string description = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->description = $var;

        return $this;
    }

    /**
     * URL with documentation or more information about this component
     *
     * Generated from protobuf field <code>string url = 5;</code>
     * @return string
     */
    public function getUrl()
    {
        return $this->url;
    }

    /**
     * URL with documentation or more information about this component
     *
     * Generated from protobuf field <code>string url = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->url = $var;

        return $this;
    }

    /**
     * Indicates whether this service is part of The Things Network (the public community network)
     *
     * Generated from protobuf field <code>bool public = 6;</code>
     * @return bool
     */
    public function getPublic()
    {
        return $this->public;
    }

    /**
     * Indicates whether this service is part of The Things Network (the public community network)
     *
     * Generated from protobuf field <code>bool public = 6;</code>
     * @param bool $var
     * @return $this
     */
    public function setPublic($var)
    {
        GPBUtil::checkBool($var);
        $this->public = $var;

        return $this;
    }

    /**
     * Comma-separated network addresses in the form "domain1:port,domain2:port,domain3:port" (currently we only use the first)
     *
     * Generated from protobuf field <code>string net_address = 11;</code>
     * @return string
     */
    public function getNetAddress()
    {
        return $this->net_address;
    }

    /**
     * Comma-separated network addresses in the form "domain1:port,domain2:port,domain3:port" (currently we only use the first)
     *
     * Generated from protobuf field <code>string net_address = 11;</code>
     * @param string $var
     * @return $this
     */
    public function setNetAddress($var)
    {
        GPBUtil::checkString($var, True);
        $this->net_address = $var;

        return $this;
    }

    /**
     * ECDSA public key of this component
     *
     * Generated from protobuf field <code>string public_key = 12;</code>
     * @return string
     */
    public function getPublicKey()
    {
        return $this->public_key;
    }

    /**
     * ECDSA public key of this component
     *
     * Generated from protobuf field <code>string public_key = 12;</code>
     * @param string $var
     * @return $this
     */
    public function setPublicKey($var)
    {
        GPBUtil::checkString($var, True);
        $this->public_key = $var;

        return $this;
    }

    /**
     * TLS Certificate for gRPC on net_address (if TLS is enabled)
     *
     * Generated from protobuf field <code>string certificate = 13;</code>
     * @return string
     */
    public function getCertificate()
    {
        return $this->certificate;
    }

    /**
     * TLS Certificate for gRPC on net_address (if TLS is enabled)
     *
     * Generated from protobuf field <code>string certificate = 13;</code>
     * @param string $var
     * @return $this
     */
    public function setCertificate($var)
    {
        GPBUtil::checkString($var, True);
        $this->certificate = $var;

        return $this;
    }

    /**
     * Contains the address where the HTTP API is exposed (if there is one).
     * Format of api_address: `http(s)://domain(:port)`
     * default http port is 80, default https port is 443.
     *
     * Generated from protobuf field <code>string api_address = 14;</code>
     * @return string
     */
    public function getApiAddress()
    {
        return $this->api_address;
    }

    /**
     * Contains the address where the HTTP API is exposed (if there is one).
     * Format of api_address: `http(s)://domain(:port)`
     * default http port is 80, default https port is 443.
     *
     * Generated from protobuf field <code>string api_address = 14;</code>
     * @param string $var
     * @return $this
     */
    public function setApiAddress($var)
    {
        GPBUtil::checkString($var, True);
        $this->api_address = $var;

        return $this;
    }

    /**
     * Contains the address where the MQTT API is exposed (if there is one)
     * Format of mqtt_address: `(mqtt(s)://)host(:port)`
     * default mqtt port is 1883, default mqtts port is 8883.
     * Examples:
     * if `host:port` then `mqtt://host:port`
     * if `host:8883` then `mqtts://host:8883`
     * if `host` then `mqtt://host:1883` and `mqtts://host:8883`
     * if `mqtt://host` then `mqtt://host:1883`
     * if `mqtts://host` then `mqtt://host:1883` and `mqtts://host:8883`
     *
     * Generated from protobuf field <code>string mqtt_address = 15;</code>
     * @return string
     */
    public function getMqttAddress()
    {
        return $this->mqtt_address;
    }

    /**
     * Contains the address where the MQTT API is exposed (if there is one)
     * Format of mqtt_address: `(mqtt(s)://)host(:port)`
     * default mqtt port is 1883, default mqtts port is 8883.
     * Examples:
     * if `host:port` then `mqtt://host:port`
     * if `host:8883` then `mqtts://host:8883`
     * if `host` then `mqtt://host:1883` and `mqtts://host:8883`
     * if `mqtt://host` then `mqtt://host:1883`
     * if `mqtts://host` then `mqtt://host:1883` and `mqtts://host:8883`
     *
     * Generated from protobuf field <code>string mqtt_address = 15;</code>
     * @param string $var
     * @return $this
     */
    public function setMqttAddress($var)
    {
        GPBUtil::checkString($var, True);
        $this->mqtt_address = $var;

        return $this;
    }

    /**
     * Contains the address where the AMQP API is exposed (if there is one)
     * Format of amqp_address: `(amqp(s)://)host(:port)`
     * default amqp port is 5672, default amqps port is 5671.
     * Examples:
     * if `host:port` then `amqp://host:port`
     * if `host:5671` then `amqps://host:5671`
     * if `host` then `amqp://host:5672` and `amqps://host:5671`
     * if `amqp://host` then `amqp://host:5672`
     * if `amqps://host` then `amqp://host:5672` and `amqps://host:5671`
     *
     * Generated from protobuf field <code>string amqp_address = 16;</code>
     * @return string
     */
    public function getAmqpAddress()
    {
        return $this->amqp_address;
    }

    /**
     * Contains the address where the AMQP API is exposed (if there is one)
     * Format of amqp_address: `(amqp(s)://)host(:port)`
     * default amqp port is 5672, default amqps port is 5671.
     * Examples:
     * if `host:port` then `amqp://host:port`
     * if `host:5671` then `amqps://host:5671`
     * if `host` then `amqp://host:5672` and `amqps://host:5671`
     * if `amqp://host` then `amqp://host:5672`
     * if `amqps://host` then `amqp://host:5672` and `amqps://host:5671`
     *
     * Generated from protobuf field <code>string amqp_address = 16;</code>
     * @param string $var
     * @return $this
     */
    public function setAmqpAddress($var)
    {
        GPBUtil::checkString($var, True);
        $this->amqp_address = $var;

        return $this;
    }

    /**
     * Metadata for this component
     *
     * Generated from protobuf field <code>repeated .discovery.Metadata metadata = 22;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getMetadata()
    {
        return $this->metadata;
    }

    /**
     * Metadata for this component
     *
     * Generated from protobuf field <code>repeated .discovery.Metadata metadata = 22;</code>
     * @param \Discovery\Metadata[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setMetadata($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Discovery\Metadata::class);
        $this->metadata = $arr;

        return $this;
    }

}


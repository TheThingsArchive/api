<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/gateway/gateway.proto

namespace Gateway;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * message Status represents a status update from a Gateway.
 *
 * Generated from protobuf message <code>gateway.Status</code>
 */
class Status extends \Google\Protobuf\Internal\Message
{
    /**
     * Timestamp (uptime of gateway) in microseconds with rollover
     *
     * Generated from protobuf field <code>uint32 timestamp = 1;</code>
     */
    private $timestamp = 0;
    /**
     * Time in Unix nanoseconds
     *
     * Generated from protobuf field <code>int64 time = 2;</code>
     */
    private $time = 0;
    /**
     * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
     *
     * Generated from protobuf field <code>bool gateway_trusted = 3;</code>
     */
    private $gateway_trusted = false;
    /**
     * Boot time in Unix nanoseconds
     *
     * Generated from protobuf field <code>int64 boot_time = 4;</code>
     */
    private $boot_time = 0;
    /**
     * Generated from protobuf field <code>repeated string ip = 11 [(.gogoproto.customname) = "IP"];</code>
     */
    private $ip;
    /**
     * Generated from protobuf field <code>string platform = 12;</code>
     */
    private $platform = '';
    /**
     * Generated from protobuf field <code>string contact_email = 13;</code>
     */
    private $contact_email = '';
    /**
     * Generated from protobuf field <code>string description = 14;</code>
     */
    private $description = '';
    /**
     * The gateway's frequency plan: one of EU_863_870, US_902_928, CN_779_787, EU_433, AU_915_928, CN_470_510, AS_923, AS_920_923, AS_923_925, KR_920_923
     *
     * Generated from protobuf field <code>string frequency_plan = 15;</code>
     */
    private $frequency_plan = '';
    /**
     * The value of Bridge is set by the Bridge
     *
     * Generated from protobuf field <code>string bridge = 16;</code>
     */
    private $bridge = '';
    /**
     * The value of Router is set by the Router
     *
     * Generated from protobuf field <code>string router = 17;</code>
     */
    private $router = '';
    /**
     * Version of Gateway FPGA
     *
     * Generated from protobuf field <code>uint32 fpga = 18 [(.gogoproto.customname) = "FPGA"];</code>
     */
    private $fpga = 0;
    /**
     * Version of Gateway DSP software
     *
     * Generated from protobuf field <code>uint32 dsp = 19 [(.gogoproto.customname) = "DSP"];</code>
     */
    private $dsp = 0;
    /**
     * Version of gateway driver (in X.X.X format)
     *
     * Generated from protobuf field <code>string hal = 20 [(.gogoproto.customname) = "HAL"];</code>
     */
    private $hal = '';
    /**
     * Generated from protobuf field <code>.gateway.LocationMetadata location = 21;</code>
     */
    private $location = null;
    /**
     * Round-trip time to the server in milliseconds
     *
     * Generated from protobuf field <code>uint32 rtt = 31 [(.gogoproto.customname) = "RTT"];</code>
     */
    private $rtt = 0;
    /**
     * Total number of received uplink packets since boot
     *
     * Generated from protobuf field <code>uint32 rx_in = 41;</code>
     */
    private $rx_in = 0;
    /**
     * Total number of successful (correct) uplink packets since boot
     *
     * Generated from protobuf field <code>uint32 rx_ok = 42;</code>
     */
    private $rx_ok = 0;
    /**
     * Total number of received downlink packets since boot
     *
     * Generated from protobuf field <code>uint32 tx_in = 43;</code>
     */
    private $tx_in = 0;
    /**
     * Total number of successfully sent downlink packets since boot
     *
     * Generated from protobuf field <code>uint32 tx_ok = 44;</code>
     */
    private $tx_ok = 0;
    /**
     * Total number of packets received from link testing mote, with CRC OK
     *
     * Generated from protobuf field <code>uint32 lm_ok = 45;</code>
     */
    private $lm_ok = 0;
    /**
     * Sequence number of the first packet received from the link testing mote
     *
     * Generated from protobuf field <code>uint32 lm_st = 46;</code>
     */
    private $lm_st = 0;
    /**
     * Sequence number of the last packet received from the link testing mote
     *
     * Generated from protobuf field <code>uint32 lm_nw = 47;</code>
     */
    private $lm_nw = 0;
    /**
     * Number of lost PPS pulses
     *
     * Generated from protobuf field <code>uint32 l_pps = 48 [(.gogoproto.customname) = "LPPS"];</code>
     */
    private $l_pps = 0;
    /**
     * Generated from protobuf field <code>.gateway.Status.OSMetrics os = 51 [(.gogoproto.customname) = "OS"];</code>
     */
    private $os = null;
    /**
     * debug or warning messages from the gateway
     *
     * Generated from protobuf field <code>repeated string messages = 52;</code>
     */
    private $messages;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Gateway\Gateway::initOnce();
        parent::__construct();
    }

    /**
     * Timestamp (uptime of gateway) in microseconds with rollover
     *
     * Generated from protobuf field <code>uint32 timestamp = 1;</code>
     * @return int
     */
    public function getTimestamp()
    {
        return $this->timestamp;
    }

    /**
     * Timestamp (uptime of gateway) in microseconds with rollover
     *
     * Generated from protobuf field <code>uint32 timestamp = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setTimestamp($var)
    {
        GPBUtil::checkUint32($var);
        $this->timestamp = $var;

        return $this;
    }

    /**
     * Time in Unix nanoseconds
     *
     * Generated from protobuf field <code>int64 time = 2;</code>
     * @return int|string
     */
    public function getTime()
    {
        return $this->time;
    }

    /**
     * Time in Unix nanoseconds
     *
     * Generated from protobuf field <code>int64 time = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setTime($var)
    {
        GPBUtil::checkInt64($var);
        $this->time = $var;

        return $this;
    }

    /**
     * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
     *
     * Generated from protobuf field <code>bool gateway_trusted = 3;</code>
     * @return bool
     */
    public function getGatewayTrusted()
    {
        return $this->gateway_trusted;
    }

    /**
     * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
     *
     * Generated from protobuf field <code>bool gateway_trusted = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setGatewayTrusted($var)
    {
        GPBUtil::checkBool($var);
        $this->gateway_trusted = $var;

        return $this;
    }

    /**
     * Boot time in Unix nanoseconds
     *
     * Generated from protobuf field <code>int64 boot_time = 4;</code>
     * @return int|string
     */
    public function getBootTime()
    {
        return $this->boot_time;
    }

    /**
     * Boot time in Unix nanoseconds
     *
     * Generated from protobuf field <code>int64 boot_time = 4;</code>
     * @param int|string $var
     * @return $this
     */
    public function setBootTime($var)
    {
        GPBUtil::checkInt64($var);
        $this->boot_time = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated string ip = 11 [(.gogoproto.customname) = "IP"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getIp()
    {
        return $this->ip;
    }

    /**
     * Generated from protobuf field <code>repeated string ip = 11 [(.gogoproto.customname) = "IP"];</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setIp($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->ip = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string platform = 12;</code>
     * @return string
     */
    public function getPlatform()
    {
        return $this->platform;
    }

    /**
     * Generated from protobuf field <code>string platform = 12;</code>
     * @param string $var
     * @return $this
     */
    public function setPlatform($var)
    {
        GPBUtil::checkString($var, True);
        $this->platform = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string contact_email = 13;</code>
     * @return string
     */
    public function getContactEmail()
    {
        return $this->contact_email;
    }

    /**
     * Generated from protobuf field <code>string contact_email = 13;</code>
     * @param string $var
     * @return $this
     */
    public function setContactEmail($var)
    {
        GPBUtil::checkString($var, True);
        $this->contact_email = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string description = 14;</code>
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Generated from protobuf field <code>string description = 14;</code>
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
     * The gateway's frequency plan: one of EU_863_870, US_902_928, CN_779_787, EU_433, AU_915_928, CN_470_510, AS_923, AS_920_923, AS_923_925, KR_920_923
     *
     * Generated from protobuf field <code>string frequency_plan = 15;</code>
     * @return string
     */
    public function getFrequencyPlan()
    {
        return $this->frequency_plan;
    }

    /**
     * The gateway's frequency plan: one of EU_863_870, US_902_928, CN_779_787, EU_433, AU_915_928, CN_470_510, AS_923, AS_920_923, AS_923_925, KR_920_923
     *
     * Generated from protobuf field <code>string frequency_plan = 15;</code>
     * @param string $var
     * @return $this
     */
    public function setFrequencyPlan($var)
    {
        GPBUtil::checkString($var, True);
        $this->frequency_plan = $var;

        return $this;
    }

    /**
     * The value of Bridge is set by the Bridge
     *
     * Generated from protobuf field <code>string bridge = 16;</code>
     * @return string
     */
    public function getBridge()
    {
        return $this->bridge;
    }

    /**
     * The value of Bridge is set by the Bridge
     *
     * Generated from protobuf field <code>string bridge = 16;</code>
     * @param string $var
     * @return $this
     */
    public function setBridge($var)
    {
        GPBUtil::checkString($var, True);
        $this->bridge = $var;

        return $this;
    }

    /**
     * The value of Router is set by the Router
     *
     * Generated from protobuf field <code>string router = 17;</code>
     * @return string
     */
    public function getRouter()
    {
        return $this->router;
    }

    /**
     * The value of Router is set by the Router
     *
     * Generated from protobuf field <code>string router = 17;</code>
     * @param string $var
     * @return $this
     */
    public function setRouter($var)
    {
        GPBUtil::checkString($var, True);
        $this->router = $var;

        return $this;
    }

    /**
     * Version of Gateway FPGA
     *
     * Generated from protobuf field <code>uint32 fpga = 18 [(.gogoproto.customname) = "FPGA"];</code>
     * @return int
     */
    public function getFpga()
    {
        return $this->fpga;
    }

    /**
     * Version of Gateway FPGA
     *
     * Generated from protobuf field <code>uint32 fpga = 18 [(.gogoproto.customname) = "FPGA"];</code>
     * @param int $var
     * @return $this
     */
    public function setFpga($var)
    {
        GPBUtil::checkUint32($var);
        $this->fpga = $var;

        return $this;
    }

    /**
     * Version of Gateway DSP software
     *
     * Generated from protobuf field <code>uint32 dsp = 19 [(.gogoproto.customname) = "DSP"];</code>
     * @return int
     */
    public function getDsp()
    {
        return $this->dsp;
    }

    /**
     * Version of Gateway DSP software
     *
     * Generated from protobuf field <code>uint32 dsp = 19 [(.gogoproto.customname) = "DSP"];</code>
     * @param int $var
     * @return $this
     */
    public function setDsp($var)
    {
        GPBUtil::checkUint32($var);
        $this->dsp = $var;

        return $this;
    }

    /**
     * Version of gateway driver (in X.X.X format)
     *
     * Generated from protobuf field <code>string hal = 20 [(.gogoproto.customname) = "HAL"];</code>
     * @return string
     */
    public function getHal()
    {
        return $this->hal;
    }

    /**
     * Version of gateway driver (in X.X.X format)
     *
     * Generated from protobuf field <code>string hal = 20 [(.gogoproto.customname) = "HAL"];</code>
     * @param string $var
     * @return $this
     */
    public function setHal($var)
    {
        GPBUtil::checkString($var, True);
        $this->hal = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gateway.LocationMetadata location = 21;</code>
     * @return \Gateway\LocationMetadata
     */
    public function getLocation()
    {
        return $this->location;
    }

    /**
     * Generated from protobuf field <code>.gateway.LocationMetadata location = 21;</code>
     * @param \Gateway\LocationMetadata $var
     * @return $this
     */
    public function setLocation($var)
    {
        GPBUtil::checkMessage($var, \Gateway\LocationMetadata::class);
        $this->location = $var;

        return $this;
    }

    /**
     * Round-trip time to the server in milliseconds
     *
     * Generated from protobuf field <code>uint32 rtt = 31 [(.gogoproto.customname) = "RTT"];</code>
     * @return int
     */
    public function getRtt()
    {
        return $this->rtt;
    }

    /**
     * Round-trip time to the server in milliseconds
     *
     * Generated from protobuf field <code>uint32 rtt = 31 [(.gogoproto.customname) = "RTT"];</code>
     * @param int $var
     * @return $this
     */
    public function setRtt($var)
    {
        GPBUtil::checkUint32($var);
        $this->rtt = $var;

        return $this;
    }

    /**
     * Total number of received uplink packets since boot
     *
     * Generated from protobuf field <code>uint32 rx_in = 41;</code>
     * @return int
     */
    public function getRxIn()
    {
        return $this->rx_in;
    }

    /**
     * Total number of received uplink packets since boot
     *
     * Generated from protobuf field <code>uint32 rx_in = 41;</code>
     * @param int $var
     * @return $this
     */
    public function setRxIn($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx_in = $var;

        return $this;
    }

    /**
     * Total number of successful (correct) uplink packets since boot
     *
     * Generated from protobuf field <code>uint32 rx_ok = 42;</code>
     * @return int
     */
    public function getRxOk()
    {
        return $this->rx_ok;
    }

    /**
     * Total number of successful (correct) uplink packets since boot
     *
     * Generated from protobuf field <code>uint32 rx_ok = 42;</code>
     * @param int $var
     * @return $this
     */
    public function setRxOk($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx_ok = $var;

        return $this;
    }

    /**
     * Total number of received downlink packets since boot
     *
     * Generated from protobuf field <code>uint32 tx_in = 43;</code>
     * @return int
     */
    public function getTxIn()
    {
        return $this->tx_in;
    }

    /**
     * Total number of received downlink packets since boot
     *
     * Generated from protobuf field <code>uint32 tx_in = 43;</code>
     * @param int $var
     * @return $this
     */
    public function setTxIn($var)
    {
        GPBUtil::checkUint32($var);
        $this->tx_in = $var;

        return $this;
    }

    /**
     * Total number of successfully sent downlink packets since boot
     *
     * Generated from protobuf field <code>uint32 tx_ok = 44;</code>
     * @return int
     */
    public function getTxOk()
    {
        return $this->tx_ok;
    }

    /**
     * Total number of successfully sent downlink packets since boot
     *
     * Generated from protobuf field <code>uint32 tx_ok = 44;</code>
     * @param int $var
     * @return $this
     */
    public function setTxOk($var)
    {
        GPBUtil::checkUint32($var);
        $this->tx_ok = $var;

        return $this;
    }

    /**
     * Total number of packets received from link testing mote, with CRC OK
     *
     * Generated from protobuf field <code>uint32 lm_ok = 45;</code>
     * @return int
     */
    public function getLmOk()
    {
        return $this->lm_ok;
    }

    /**
     * Total number of packets received from link testing mote, with CRC OK
     *
     * Generated from protobuf field <code>uint32 lm_ok = 45;</code>
     * @param int $var
     * @return $this
     */
    public function setLmOk($var)
    {
        GPBUtil::checkUint32($var);
        $this->lm_ok = $var;

        return $this;
    }

    /**
     * Sequence number of the first packet received from the link testing mote
     *
     * Generated from protobuf field <code>uint32 lm_st = 46;</code>
     * @return int
     */
    public function getLmSt()
    {
        return $this->lm_st;
    }

    /**
     * Sequence number of the first packet received from the link testing mote
     *
     * Generated from protobuf field <code>uint32 lm_st = 46;</code>
     * @param int $var
     * @return $this
     */
    public function setLmSt($var)
    {
        GPBUtil::checkUint32($var);
        $this->lm_st = $var;

        return $this;
    }

    /**
     * Sequence number of the last packet received from the link testing mote
     *
     * Generated from protobuf field <code>uint32 lm_nw = 47;</code>
     * @return int
     */
    public function getLmNw()
    {
        return $this->lm_nw;
    }

    /**
     * Sequence number of the last packet received from the link testing mote
     *
     * Generated from protobuf field <code>uint32 lm_nw = 47;</code>
     * @param int $var
     * @return $this
     */
    public function setLmNw($var)
    {
        GPBUtil::checkUint32($var);
        $this->lm_nw = $var;

        return $this;
    }

    /**
     * Number of lost PPS pulses
     *
     * Generated from protobuf field <code>uint32 l_pps = 48 [(.gogoproto.customname) = "LPPS"];</code>
     * @return int
     */
    public function getLPps()
    {
        return $this->l_pps;
    }

    /**
     * Number of lost PPS pulses
     *
     * Generated from protobuf field <code>uint32 l_pps = 48 [(.gogoproto.customname) = "LPPS"];</code>
     * @param int $var
     * @return $this
     */
    public function setLPps($var)
    {
        GPBUtil::checkUint32($var);
        $this->l_pps = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gateway.Status.OSMetrics os = 51 [(.gogoproto.customname) = "OS"];</code>
     * @return \Gateway\Status_OSMetrics
     */
    public function getOs()
    {
        return $this->os;
    }

    /**
     * Generated from protobuf field <code>.gateway.Status.OSMetrics os = 51 [(.gogoproto.customname) = "OS"];</code>
     * @param \Gateway\Status_OSMetrics $var
     * @return $this
     */
    public function setOs($var)
    {
        GPBUtil::checkMessage($var, \Gateway\Status_OSMetrics::class);
        $this->os = $var;

        return $this;
    }

    /**
     * debug or warning messages from the gateway
     *
     * Generated from protobuf field <code>repeated string messages = 52;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getMessages()
    {
        return $this->messages;
    }

    /**
     * debug or warning messages from the gateway
     *
     * Generated from protobuf field <code>repeated string messages = 52;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setMessages($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->messages = $arr;

        return $this;
    }

}


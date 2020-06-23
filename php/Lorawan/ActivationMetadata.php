<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>lorawan.ActivationMetadata</code>
 */
class ActivationMetadata extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes app_eui = 1;</code>
     */
    protected $app_eui = '';
    /**
     * Generated from protobuf field <code>bytes dev_eui = 2;</code>
     */
    protected $dev_eui = '';
    /**
     * Generated from protobuf field <code>bytes dev_addr = 3;</code>
     */
    protected $dev_addr = '';
    /**
     * Generated from protobuf field <code>bytes nwk_s_key = 4;</code>
     */
    protected $nwk_s_key = '';
    /**
     * Generated from protobuf field <code>uint32 rx1_dr_offset = 11;</code>
     */
    protected $rx1_dr_offset = 0;
    /**
     * Generated from protobuf field <code>uint32 rx2_dr = 12;</code>
     */
    protected $rx2_dr = 0;
    /**
     * Generated from protobuf field <code>uint32 rx_delay = 13;</code>
     */
    protected $rx_delay = 0;
    /**
     * Generated from protobuf field <code>.lorawan.CFList cf_list = 14;</code>
     */
    protected $cf_list = null;
    /**
     * Generated from protobuf field <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    protected $frequency_plan = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $app_eui
     *     @type string $dev_eui
     *     @type string $dev_addr
     *     @type string $nwk_s_key
     *     @type int $rx1_dr_offset
     *     @type int $rx2_dr
     *     @type int $rx_delay
     *     @type \Lorawan\CFList $cf_list
     *     @type int $frequency_plan
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes app_eui = 1;</code>
     * @return string
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * Generated from protobuf field <code>bytes app_eui = 1;</code>
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
     * Generated from protobuf field <code>bytes dev_eui = 2;</code>
     * @return string
     */
    public function getDevEui()
    {
        return $this->dev_eui;
    }

    /**
     * Generated from protobuf field <code>bytes dev_eui = 2;</code>
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
     * Generated from protobuf field <code>bytes dev_addr = 3;</code>
     * @return string
     */
    public function getDevAddr()
    {
        return $this->dev_addr;
    }

    /**
     * Generated from protobuf field <code>bytes dev_addr = 3;</code>
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
     * Generated from protobuf field <code>bytes nwk_s_key = 4;</code>
     * @return string
     */
    public function getNwkSKey()
    {
        return $this->nwk_s_key;
    }

    /**
     * Generated from protobuf field <code>bytes nwk_s_key = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setNwkSKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->nwk_s_key = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 rx1_dr_offset = 11;</code>
     * @return int
     */
    public function getRx1DrOffset()
    {
        return $this->rx1_dr_offset;
    }

    /**
     * Generated from protobuf field <code>uint32 rx1_dr_offset = 11;</code>
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
     * Generated from protobuf field <code>uint32 rx2_dr = 12;</code>
     * @return int
     */
    public function getRx2Dr()
    {
        return $this->rx2_dr;
    }

    /**
     * Generated from protobuf field <code>uint32 rx2_dr = 12;</code>
     * @param int $var
     * @return $this
     */
    public function setRx2Dr($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx2_dr = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 rx_delay = 13;</code>
     * @return int
     */
    public function getRxDelay()
    {
        return $this->rx_delay;
    }

    /**
     * Generated from protobuf field <code>uint32 rx_delay = 13;</code>
     * @param int $var
     * @return $this
     */
    public function setRxDelay($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx_delay = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.lorawan.CFList cf_list = 14;</code>
     * @return \Lorawan\CFList
     */
    public function getCfList()
    {
        return $this->cf_list;
    }

    /**
     * Generated from protobuf field <code>.lorawan.CFList cf_list = 14;</code>
     * @param \Lorawan\CFList $var
     * @return $this
     */
    public function setCfList($var)
    {
        GPBUtil::checkMessage($var, \Lorawan\CFList::class);
        $this->cf_list = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     * @return int
     */
    public function getFrequencyPlan()
    {
        return $this->frequency_plan;
    }

    /**
     * Generated from protobuf field <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     * @param int $var
     * @return $this
     */
    public function setFrequencyPlan($var)
    {
        GPBUtil::checkEnum($var, \Lorawan\FrequencyPlan::class);
        $this->frequency_plan = $var;

        return $this;
    }

}


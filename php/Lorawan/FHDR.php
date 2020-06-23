<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>lorawan.FHDR</code>
 */
class FHDR extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes dev_addr = 1;</code>
     */
    protected $dev_addr = '';
    /**
     * Generated from protobuf field <code>.lorawan.FCtrl f_ctrl = 2;</code>
     */
    protected $f_ctrl = null;
    /**
     * Generated from protobuf field <code>uint32 f_cnt = 3;</code>
     */
    protected $f_cnt = 0;
    /**
     * Generated from protobuf field <code>repeated .lorawan.MACCommand f_opts = 4;</code>
     */
    private $f_opts;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $dev_addr
     *     @type \Lorawan\FCtrl $f_ctrl
     *     @type int $f_cnt
     *     @type \Lorawan\MACCommand[]|\Google\Protobuf\Internal\RepeatedField $f_opts
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes dev_addr = 1;</code>
     * @return string
     */
    public function getDevAddr()
    {
        return $this->dev_addr;
    }

    /**
     * Generated from protobuf field <code>bytes dev_addr = 1;</code>
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
     * Generated from protobuf field <code>.lorawan.FCtrl f_ctrl = 2;</code>
     * @return \Lorawan\FCtrl
     */
    public function getFCtrl()
    {
        return $this->f_ctrl;
    }

    /**
     * Generated from protobuf field <code>.lorawan.FCtrl f_ctrl = 2;</code>
     * @param \Lorawan\FCtrl $var
     * @return $this
     */
    public function setFCtrl($var)
    {
        GPBUtil::checkMessage($var, \Lorawan\FCtrl::class);
        $this->f_ctrl = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 f_cnt = 3;</code>
     * @return int
     */
    public function getFCnt()
    {
        return $this->f_cnt;
    }

    /**
     * Generated from protobuf field <code>uint32 f_cnt = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setFCnt($var)
    {
        GPBUtil::checkUint32($var);
        $this->f_cnt = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .lorawan.MACCommand f_opts = 4;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getFOpts()
    {
        return $this->f_opts;
    }

    /**
     * Generated from protobuf field <code>repeated .lorawan.MACCommand f_opts = 4;</code>
     * @param \Lorawan\MACCommand[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setFOpts($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Lorawan\MACCommand::class);
        $this->f_opts = $arr;

        return $this;
    }

}


<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>lorawan.MHDR</code>
 */
class MHDR extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.lorawan.MType m_type = 1;</code>
     */
    private $m_type = 0;
    /**
     * Generated from protobuf field <code>.lorawan.Major major = 2;</code>
     */
    private $major = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $m_type
     *     @type int $major
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.lorawan.MType m_type = 1;</code>
     * @return int
     */
    public function getMType()
    {
        return $this->m_type;
    }

    /**
     * Generated from protobuf field <code>.lorawan.MType m_type = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setMType($var)
    {
        GPBUtil::checkEnum($var, \Lorawan\MType::class);
        $this->m_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.lorawan.Major major = 2;</code>
     * @return int
     */
    public function getMajor()
    {
        return $this->major;
    }

    /**
     * Generated from protobuf field <code>.lorawan.Major major = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setMajor($var)
    {
        GPBUtil::checkEnum($var, \Lorawan\Major::class);
        $this->major = $var;

        return $this;
    }

}


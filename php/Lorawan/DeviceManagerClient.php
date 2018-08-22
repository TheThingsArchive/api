<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Lorawan;

/**
 */
class DeviceManagerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \Lorawan\DeviceIdentifier $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetDevice(\Lorawan\DeviceIdentifier $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lorawan.DeviceManager/GetDevice',
        $argument,
        ['\Lorawan\Device', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Lorawan\Device $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SetDevice(\Lorawan\Device $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lorawan.DeviceManager/SetDevice',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Lorawan\DeviceIdentifier $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteDevice(\Lorawan\DeviceIdentifier $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/lorawan.DeviceManager/DeleteDevice',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

}

<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Networkserver;

/**
 */
class NetworkServerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
     * @param \Networkserver\DevicesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetDevices(\Networkserver\DevicesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/networkserver.NetworkServer/GetDevices',
        $argument,
        ['\Networkserver\DevicesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Broker requests device activation "template" from Network Server
     * @param \Broker\DeduplicatedDeviceActivationRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function PrepareActivation(\Broker\DeduplicatedDeviceActivationRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/networkserver.NetworkServer/PrepareActivation',
        $argument,
        ['\Broker\DeduplicatedDeviceActivationRequest', 'decode'],
        $metadata, $options);
    }

    /**
     * Broker confirms device activation (after response from Handler)
     * @param \Handler\DeviceActivationResponse $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Activate(\Handler\DeviceActivationResponse $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/networkserver.NetworkServer/Activate',
        $argument,
        ['\Handler\DeviceActivationResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Broker informs Network Server about Uplink
     * @param \Broker\DeduplicatedUplinkMessage $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Uplink(\Broker\DeduplicatedUplinkMessage $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/networkserver.NetworkServer/Uplink',
        $argument,
        ['\Broker\DeduplicatedUplinkMessage', 'decode'],
        $metadata, $options);
    }

    /**
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * @param \Broker\DownlinkMessage $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Downlink(\Broker\DownlinkMessage $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/networkserver.NetworkServer/Downlink',
        $argument,
        ['\Broker\DownlinkMessage', 'decode'],
        $metadata, $options);
    }

}

<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Broker;

/**
 * The Broker service provides pure network functionality
 */
class BrokerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Router initiates an Association with the Broker.
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Associate($metadata = [], $options = []) {
        return $this->_bidiRequest('/broker.Broker/Associate',
        ['\Broker\DownlinkMessage','decode'],
        $metadata, $options);
    }

    /**
     * Handler subscribes to uplink stream.
     * @param \Broker\SubscribeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Subscribe(\Broker\SubscribeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/broker.Broker/Subscribe',
        $argument,
        ['\Broker\DeduplicatedUplinkMessage', 'decode'],
        $metadata, $options);
    }

    /**
     * Handler initiates downlink stream.
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Publish($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/broker.Broker/Publish',
        ['\Google\Protobuf\GPBEmpty','decode'],
        $metadata, $options);
    }

    /**
     * Router requests device activation
     * @param \Broker\DeviceActivationRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Activate(\Broker\DeviceActivationRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/broker.Broker/Activate',
        $argument,
        ['\Broker\DeviceActivationResponse', 'decode'],
        $metadata, $options);
    }

}

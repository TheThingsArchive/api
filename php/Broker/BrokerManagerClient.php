<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Broker;

/**
 * The BrokerManager service provides configuration and monitoring functionality
 */
class BrokerManagerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Handler announces a new application to Broker. This is a temporary method that will be removed
     * when we can push updates from the Discovery service to the routing services.
     * @param \Broker\ApplicationHandlerRegistration $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function RegisterApplicationHandler(\Broker\ApplicationHandlerRegistration $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/broker.BrokerManager/RegisterApplicationHandler',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * Network operator requests Broker status
     * @param \Broker\StatusRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetStatus(\Broker\StatusRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/broker.BrokerManager/GetStatus',
        $argument,
        ['\Broker\Status', 'decode'],
        $metadata, $options);
    }

}

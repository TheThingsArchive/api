<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Router;

/**
 * The RouterManager service provides configuration and monitoring functionality
 */
class RouterManagerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Gateway owner or network operator requests Gateway status from Router Manager
     * Deprecated: Use monitor API (NOC) instead of this
     * @param \Router\GatewayStatusRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GatewayStatus(\Router\GatewayStatusRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/router.RouterManager/GatewayStatus',
        $argument,
        ['\Router\GatewayStatusResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Network operator requests Router status
     * @param \Router\StatusRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetStatus(\Router\StatusRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/router.RouterManager/GetStatus',
        $argument,
        ['\Router\Status', 'decode'],
        $metadata, $options);
    }

}

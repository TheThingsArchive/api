<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Networkserver;

/**
 * The NetworkServerManager service provides configuration and monitoring
 * functionality
 */
class NetworkServerManagerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \Networkserver\StatusRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetStatus(\Networkserver\StatusRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/networkserver.NetworkServerManager/GetStatus',
        $argument,
        ['\Networkserver\Status', 'decode'],
        $metadata, $options);
    }

}

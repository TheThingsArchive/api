<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Handler;

/**
 * The HandlerManager service provides configuration and monitoring
 * functionality
 */
class HandlerManagerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \Handler\StatusRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetStatus(\Handler\StatusRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.HandlerManager/GetStatus',
        $argument,
        ['\Handler\Status', 'decode'],
        $metadata, $options);
    }

}

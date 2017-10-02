<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.
//
namespace Handler;

/**
 * The Handler service provides pure network functionality
 */
class HandlerClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \Broker\ActivationChallengeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ActivationChallenge(\Broker\ActivationChallengeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.Handler/ActivationChallenge',
        $argument,
        ['\Broker\ActivationChallengeResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Broker\DeduplicatedDeviceActivationRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Activate(\Broker\DeduplicatedDeviceActivationRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/handler.Handler/Activate',
        $argument,
        ['\Handler\DeviceActivationResponse', 'decode'],
        $metadata, $options);
    }

}

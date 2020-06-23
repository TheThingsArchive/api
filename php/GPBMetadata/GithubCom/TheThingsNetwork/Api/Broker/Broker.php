<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/broker/broker.proto

namespace GPBMetadata\GithubCom\TheThingsNetwork\Api\Broker;

class Broker
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Api::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Protocol::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Gateway\Gateway::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Trace\Trace::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0ae61b0a336769746875622e636f6d2f5468655468696e67734e6574776f" .
            "726b2f6170692f62726f6b65722f62726f6b65722e70726f746f12066272" .
            "6f6b65721a296769746875622e636f6d2f5468655468696e67734e657477" .
            "6f726b2f6170692f6170692e70726f746f1a376769746875622e636f6d2f" .
            "5468655468696e67734e6574776f726b2f6170692f70726f746f636f6c2f" .
            "70726f746f636f6c2e70726f746f1a356769746875622e636f6d2f546865" .
            "5468696e67734e6574776f726b2f6170692f676174657761792f67617465" .
            "7761792e70726f746f1a316769746875622e636f6d2f5468655468696e67" .
            "734e6574776f726b2f6170692f74726163652f74726163652e70726f746f" .
            "22cd010a0e446f776e6c696e6b4f7074696f6e12120a0a6964656e746966" .
            "69657218012001280912120a0a676174657761795f696418022001280912" .
            "0d0a0573636f726518032001280d12100a08646561646c696e6518042001" .
            "280312390a1670726f746f636f6c5f636f6e66696775726174696f6e1805" .
            "2001280b32192e70726f746f636f6c2e5478436f6e66696775726174696f" .
            "6e12370a15676174657761795f636f6e66696775726174696f6e18062001" .
            "280b32182e676174657761792e5478436f6e66696775726174696f6e22b5" .
            "020a0d55706c696e6b4d657373616765120f0a077061796c6f6164180120" .
            "01280c12220a076d65737361676518022001280b32112e70726f746f636f" .
            "6c2e4d657373616765120f0a076465765f657569180b2001280c120f0a07" .
            "6170705f657569180c2001280c120e0a066170705f6964180d2001280912" .
            "0e0a066465765f6964180e20012809122f0a1170726f746f636f6c5f6d65" .
            "74616461746118152001280b32142e70726f746f636f6c2e52784d657461" .
            "64617461122d0a10676174657761795f6d6574616461746118162001280b" .
            "32132e676174657761792e52784d6574616461746112300a10646f776e6c" .
            "696e6b5f6f7074696f6e73181f2003280b32162e62726f6b65722e446f77" .
            "6e6c696e6b4f7074696f6e121b0a05747261636518292001280b320c2e74" .
            "726163652e547261636522d6010a0f446f776e6c696e6b4d657373616765" .
            "120f0a077061796c6f616418012001280c12220a076d6573736167651802" .
            "2001280b32112e70726f746f636f6c2e4d657373616765120f0a07646576" .
            "5f657569180b2001280c120f0a076170705f657569180c2001280c120e0a" .
            "066170705f6964180d20012809120e0a066465765f6964180e2001280912" .
            "2f0a0f646f776e6c696e6b5f6f7074696f6e18152001280b32162e62726f" .
            "6b65722e446f776e6c696e6b4f7074696f6e121b0a057472616365181f20" .
            "01280b320c2e74726163652e5472616365229d010a184465766963654163" .
            "7469766174696f6e526573706f6e7365120f0a077061796c6f6164180120" .
            "01280c12220a076d65737361676518022001280b32112e70726f746f636f" .
            "6c2e4d657373616765122f0a0f646f776e6c696e6b5f6f7074696f6e180b" .
            "2001280b32162e62726f6b65722e446f776e6c696e6b4f7074696f6e121b" .
            "0a05747261636518152001280b320c2e74726163652e547261636522d802" .
            "0a1944656475706c69636174656455706c696e6b4d657373616765120f0a" .
            "077061796c6f616418012001280c12220a076d6573736167651802200128" .
            "0b32112e70726f746f636f6c2e4d657373616765120f0a076465765f6575" .
            "69180b2001280c120f0a076170705f657569180c2001280c120e0a066170" .
            "705f6964180d20012809120e0a066465765f6964180e20012809122f0a11" .
            "70726f746f636f6c5f6d6574616461746118152001280b32142e70726f74" .
            "6f636f6c2e52784d65746164617461122d0a10676174657761795f6d6574" .
            "616461746118162003280b32132e676174657761792e52784d6574616461" .
            "746112130a0b7365727665725f74696d6518172001280312320a11726573" .
            "706f6e73655f74656d706c617465181f2001280b32172e62726f6b65722e" .
            "446f776e6c696e6b4d657373616765121b0a05747261636518292001280b" .
            "320c2e74726163652e547261636522da020a174465766963654163746976" .
            "6174696f6e52657175657374120f0a077061796c6f616418012001280c12" .
            "220a076d65737361676518022001280b32112e70726f746f636f6c2e4d65" .
            "7373616765120f0a076465765f657569180b2001280c120f0a076170705f" .
            "657569180c2001280c122f0a1170726f746f636f6c5f6d65746164617461" .
            "18152001280b32142e70726f746f636f6c2e52784d65746164617461122d" .
            "0a10676174657761795f6d6574616461746118162001280b32132e676174" .
            "657761792e52784d6574616461746112390a1361637469766174696f6e5f" .
            "6d6574616461746118172001280b321c2e70726f746f636f6c2e41637469" .
            "766174696f6e4d6574616461746112300a10646f776e6c696e6b5f6f7074" .
            "696f6e73181f2003280b32162e62726f6b65722e446f776e6c696e6b4f70" .
            "74696f6e121b0a05747261636518292001280b320c2e74726163652e5472" .
            "61636522a6030a2344656475706c69636174656444657669636541637469" .
            "766174696f6e52657175657374120f0a077061796c6f616418012001280c" .
            "12220a076d65737361676518022001280b32112e70726f746f636f6c2e4d" .
            "657373616765120f0a076465765f657569180b2001280c120f0a07617070" .
            "5f657569180c2001280c120e0a066170705f6964180d20012809120e0a06" .
            "6465765f6964180e20012809122f0a1170726f746f636f6c5f6d65746164" .
            "61746118152001280b32142e70726f746f636f6c2e52784d657461646174" .
            "61122d0a10676174657761795f6d6574616461746118162003280b32132e" .
            "676174657761792e52784d6574616461746112390a136163746976617469" .
            "6f6e5f6d6574616461746118172001280b321c2e70726f746f636f6c2e41" .
            "637469766174696f6e4d6574616461746112130a0b7365727665725f7469" .
            "6d65181820012803123b0a11726573706f6e73655f74656d706c61746518" .
            "1f2001280b32202e62726f6b65722e44657669636541637469766174696f" .
            "6e526573706f6e7365121b0a05747261636518292001280b320c2e747261" .
            "63652e54726163652293010a1a41637469766174696f6e4368616c6c656e" .
            "676552657175657374120f0a077061796c6f616418012001280c12220a07" .
            "6d65737361676518022001280b32112e70726f746f636f6c2e4d65737361" .
            "6765120f0a076465765f657569180b2001280c120f0a076170705f657569" .
            "180c2001280c120e0a066170705f6964180d20012809120e0a066465765f" .
            "6964180e2001280922520a1b41637469766174696f6e4368616c6c656e67" .
            "65526573706f6e7365120f0a077061796c6f616418012001280c12220a07" .
            "6d65737361676518022001280b32112e70726f746f636f6c2e4d65737361" .
            "676522120a1053756273637269626552657175657374220f0a0d53746174" .
            "75735265717565737422d8020a0653746174757312200a0673797374656d" .
            "18012001280b32102e6170692e53797374656d537461747312260a09636f" .
            "6d706f6e656e7418022001280b32132e6170692e436f6d706f6e656e7453" .
            "74617473121a0a0675706c696e6b180b2001280b320a2e6170692e526174" .
            "657312210a0d75706c696e6b5f756e69717565180c2001280b320a2e6170" .
            "692e5261746573121c0a08646f776e6c696e6b180d2001280b320a2e6170" .
            "692e5261746573121f0a0b61637469766174696f6e73180e2001280b320a" .
            "2e6170692e526174657312260a1261637469766174696f6e735f756e6971" .
            "7565180f2001280b320a2e6170692e526174657312270a0d64656475706c" .
            "69636174696f6e18102001280b32102e6170692e50657263656e74696c65" .
            "7312190a11636f6e6e65637465645f726f757465727318152001280d121a" .
            "0a12636f6e6e65637465645f68616e646c65727318162001280d22440a1e" .
            "4170706c69636174696f6e48616e646c6572526567697374726174696f6e" .
            "120e0a066170705f696418012001280912120a0a68616e646c65725f6964" .
            "18022001280932a2020a0642726f6b6572123f0a094173736f6369617465" .
            "12152e62726f6b65722e55706c696e6b4d6573736167651a172e62726f6b" .
            "65722e446f776e6c696e6b4d65737361676528013001124a0a0953756273" .
            "637269626512182e62726f6b65722e537562736372696265526571756573" .
            "741a212e62726f6b65722e44656475706c69636174656455706c696e6b4d" .
            "6573736167653001123c0a075075626c69736812172e62726f6b65722e44" .
            "6f776e6c696e6b4d6573736167651a162e676f6f676c652e70726f746f62" .
            "75662e456d7074792801124d0a084163746976617465121f2e62726f6b65" .
            "722e44657669636541637469766174696f6e526571756573741a202e6272" .
            "6f6b65722e44657669636541637469766174696f6e526573706f6e736532" .
            "a1010a0d42726f6b65724d616e61676572125c0a1a526567697374657241" .
            "70706c69636174696f6e48616e646c657212262e62726f6b65722e417070" .
            "6c69636174696f6e48616e646c6572526567697374726174696f6e1a162e" .
            "676f6f676c652e70726f746f6275662e456d70747912320a094765745374" .
            "6174757312152e62726f6b65722e537461747573526571756573741a0e2e" .
            "62726f6b65722e53746174757342760a1f6f72672e7468657468696e6773" .
            "6e6574776f726b2e6170692e62726f6b6572420b42726f6b657250726f74" .
            "6f50015a266769746875622e636f6d2f5468655468696e67734e6574776f" .
            "726b2f6170692f62726f6b6572aa021b5468655468696e67734e6574776f" .
            "726b2e4150492e42726f6b6572620670726f746f33"
        ), true);

        static::$is_initialized = true;
    }
}


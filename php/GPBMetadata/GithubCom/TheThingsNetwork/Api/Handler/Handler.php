<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/handler/handler.proto

namespace GPBMetadata\GithubCom\TheThingsNetwork\Api\Handler;

class Handler
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        \GPBMetadata\Google\Api\Annotations::initOnce();
        \GPBMetadata\GithubCom\Gogo\Protobuf\Gogoproto\Gogo::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Api::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Broker\Broker::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Protocol::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Device::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Trace\Trace::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0af31c0a356769746875622e636f6d2f5468655468696e67734e6574776f" .
            "726b2f6170692f68616e646c65722f68616e646c65722e70726f746f1207" .
            "68616e646c65721a1c676f6f676c652f6170692f616e6e6f746174696f6e" .
            "732e70726f746f1a2d6769746875622e636f6d2f676f676f2f70726f746f" .
            "6275662f676f676f70726f746f2f676f676f2e70726f746f1a2967697468" .
            "75622e636f6d2f5468655468696e67734e6574776f726b2f6170692f6170" .
            "692e70726f746f1a336769746875622e636f6d2f5468655468696e67734e" .
            "6574776f726b2f6170692f62726f6b65722f62726f6b65722e70726f746f" .
            "1a376769746875622e636f6d2f5468655468696e67734e6574776f726b2f" .
            "6170692f70726f746f636f6c2f70726f746f636f6c2e70726f746f1a3d67" .
            "69746875622e636f6d2f5468655468696e67734e6574776f726b2f617069" .
            "2f70726f746f636f6c2f6c6f726177616e2f6465766963652e70726f746f" .
            "1a316769746875622e636f6d2f5468655468696e67734e6574776f726b2f" .
            "6170692f74726163652f74726163652e70726f746f22e4010a1844657669" .
            "636541637469766174696f6e526573706f6e7365120f0a077061796c6f61" .
            "6418012001280c12220a076d65737361676518022001280b32112e70726f" .
            "746f636f6c2e4d65737361676512350a0f646f776e6c696e6b5f6f707469" .
            "6f6e180b2001280b32162e62726f6b65722e446f776e6c696e6b4f707469" .
            "6f6e4204c8de1f00123f0a1361637469766174696f6e5f6d657461646174" .
            "6118172001280b321c2e70726f746f636f6c2e41637469766174696f6e4d" .
            "657461646174614204c8de1f00121b0a057472616365181f2001280b320c" .
            "2e74726163652e5472616365220f0a0d5374617475735265717565737422" .
            "b9010a0653746174757312260a0673797374656d18012001280b32102e61" .
            "70692e53797374656d53746174734204c8de1f00122c0a09636f6d706f6e" .
            "656e7418022001280b32132e6170692e436f6d706f6e656e745374617473" .
            "4204c8de1f00121a0a0675706c696e6b180b2001280b320a2e6170692e52" .
            "61746573121c0a08646f776e6c696e6b180c2001280b320a2e6170692e52" .
            "61746573121f0a0b61637469766174696f6e73180d2001280b320a2e6170" .
            "692e526174657322320a154170706c69636174696f6e4964656e74696669" .
            "657212190a066170705f69641801200128094209e2de1f05417070494422" .
            "ad010a0b4170706c69636174696f6e12190a066170705f69641801200128" .
            "094209e2de1f05417070494412160a0e7061796c6f61645f666f726d6174" .
            "180620012809120f0a076465636f64657218022001280912110a09636f6e" .
            "76657274657218032001280912110a0976616c696461746f721804200128" .
            "09120f0a07656e636f64657218052001280912230a1b7265676973746572" .
            "5f6f6e5f6a6f696e5f6163636573735f6b657918072001280922480a1044" .
            "65766963654964656e74696669657212190a066170705f69641801200128" .
            "094209e2de1f05417070494412190a066465765f69641802200128094209" .
            "e2de1f05446576494422ba020a0644657669636512190a066170705f6964" .
            "1801200128094209e2de1f05417070494412190a066465765f6964180220" .
            "0128094209e2de1f054465764944123c0a0e6c6f726177616e5f64657669" .
            "636518032001280b320f2e6c6f726177616e2e4465766963654211e2de1f" .
            "0d4c6f526157414e446576696365480012100a086c61746974756465180a" .
            "2001280212110a096c6f6e676974756465180b2001280212100a08616c74" .
            "6974756465180c2001280512330a0a61747472696275746573180d200328" .
            "0b321f2e68616e646c65722e4465766963652e4174747269627574657345" .
            "6e74727912130a0b6465736372697074696f6e1814200128091a310a0f41" .
            "747472696275746573456e747279120b0a036b6579180120012809120d0a" .
            "0576616c75651802200128093a02380142080a06646576696365222e0a0a" .
            "4465766963654c69737412200a076465766963657318012003280b320f2e" .
            "68616e646c65722e446576696365226c0a12447279446f776e6c696e6b4d" .
            "657373616765120f0a077061796c6f616418012001280c120e0a06666965" .
            "6c647318022001280912270a0361707018032001280b32142e68616e646c" .
            "65722e4170706c69636174696f6e4204c8de1f00120c0a04706f72741804" .
            "2001280d225a0a1044727955706c696e6b4d657373616765120f0a077061" .
            "796c6f616418012001280c12270a0361707018022001280b32142e68616e" .
            "646c65722e4170706c69636174696f6e4204c8de1f00120c0a04706f7274" .
            "18032001280d226d0a1653696d756c6174656455706c696e6b4d65737361" .
            "676512190a066170705f69641801200128094209e2de1f05417070494412" .
            "190a066465765f69641802200128094209e2de1f054465764944120f0a07" .
            "7061796c6f616418032001280c120c0a04706f727418042001280d222c0a" .
            "084c6f67456e74727912100a0866756e6374696f6e180120012809120e0a" .
            "066669656c647318022003280922620a0f44727955706c696e6b52657375" .
            "6c74120f0a077061796c6f616418012001280c120e0a066669656c647318" .
            "0220012809120d0a0576616c6964180320012808121f0a046c6f67731804" .
            "2003280b32112e68616e646c65722e4c6f67456e74727922450a11447279" .
            "446f776e6c696e6b526573756c74120f0a077061796c6f61641801200128" .
            "0c121f0a046c6f677318022003280b32112e68616e646c65722e4c6f6745" .
            "6e74727932c5010a0748616e646c6572125e0a1341637469766174696f6e" .
            "4368616c6c656e676512222e62726f6b65722e41637469766174696f6e43" .
            "68616c6c656e6765526571756573741a232e62726f6b65722e4163746976" .
            "6174696f6e4368616c6c656e6765526573706f6e7365125a0a0841637469" .
            "76617465122b2e62726f6b65722e44656475706c69636174656444657669" .
            "636541637469766174696f6e526571756573741a212e68616e646c65722e" .
            "44657669636541637469766174696f6e526573706f6e736532e3090a1241" .
            "70706c69636174696f6e4d616e6167657212670a13526567697374657241" .
            "70706c69636174696f6e121e2e68616e646c65722e4170706c6963617469" .
            "6f6e4964656e7469666965721a162e676f6f676c652e70726f746f627566" .
            "2e456d707479221882d3e4930212220d2f6170706c69636174696f6e733a" .
            "012a12660a0e4765744170706c69636174696f6e121e2e68616e646c6572" .
            "2e4170706c69636174696f6e4964656e7469666965721a142e68616e646c" .
            "65722e4170706c69636174696f6e221e82d3e493021812162f6170706c69" .
            "636174696f6e732f7b6170705f69647d127e0a0e5365744170706c696361" .
            "74696f6e12142e68616e646c65722e4170706c69636174696f6e1a162e67" .
            "6f6f676c652e70726f746f6275662e456d707479223e82d3e49302382216" .
            "2f6170706c69636174696f6e732f7b6170705f69647d3a012a5a1b1a162f" .
            "6170706c69636174696f6e732f7b6170705f69647d3a012a126b0a114465" .
            "6c6574654170706c69636174696f6e121e2e68616e646c65722e4170706c" .
            "69636174696f6e4964656e7469666965721a162e676f6f676c652e70726f" .
            "746f6275662e456d707479221e82d3e49302182a162f6170706c69636174" .
            "696f6e732f7b6170705f69647d12680a0947657444657669636512192e68" .
            "616e646c65722e4465766963654964656e7469666965721a0f2e68616e64" .
            "6c65722e446576696365222f82d3e493022912272f6170706c6963617469" .
            "6f6e732f7b6170705f69647d2f646576696365732f7b6465765f69647d12" .
            "e2010a09536574446576696365120f2e68616e646c65722e446576696365" .
            "1a162e676f6f676c652e70726f746f6275662e456d70747922ab0182d3e4" .
            "9302a40122272f6170706c69636174696f6e732f7b6170705f69647d2f64" .
            "6576696365732f7b6465765f69647d3a012a5a2c1a272f6170706c696361" .
            "74696f6e732f7b6170705f69647d2f646576696365732f7b6465765f6964" .
            "7d3a012a5a23221e2f6170706c69636174696f6e732f7b6170705f69647d" .
            "2f646576696365733a012a5a231a1e2f6170706c69636174696f6e732f7b" .
            "6170705f69647d2f646576696365733a012a12720a0c44656c6574654465" .
            "7669636512192e68616e646c65722e4465766963654964656e7469666965" .
            "721a162e676f6f676c652e70726f746f6275662e456d707479222f82d3e4" .
            "9302292a272f6170706c69636174696f6e732f7b6170705f69647d2f6465" .
            "76696365732f7b6465765f69647d12770a1847657444657669636573466f" .
            "724170706c69636174696f6e121e2e68616e646c65722e4170706c696361" .
            "74696f6e4964656e7469666965721a132e68616e646c65722e4465766963" .
            "654c697374222682d3e4930220121e2f6170706c69636174696f6e732f7b" .
            "6170705f69647d2f6465766963657312460a0b447279446f776e6c696e6b" .
            "121b2e68616e646c65722e447279446f776e6c696e6b4d6573736167651a" .
            "1a2e68616e646c65722e447279446f776e6c696e6b526573756c7412400a" .
            "0944727955706c696e6b12192e68616e646c65722e44727955706c696e6b" .
            "4d6573736167651a182e68616e646c65722e44727955706c696e6b526573" .
            "756c7412490a0e53696d756c61746555706c696e6b121f2e68616e646c65" .
            "722e53696d756c6174656455706c696e6b4d6573736167651a162e676f6f" .
            "676c652e70726f746f6275662e456d70747932460a0e48616e646c65724d" .
            "616e6167657212340a0947657453746174757312162e68616e646c65722e" .
            "537461747573526571756573741a0f2e68616e646c65722e537461747573" .
            "427a0a206f72672e7468657468696e67736e6574776f726b2e6170692e68" .
            "616e646c6572420c48616e646c657250726f746f50015a27676974687562" .
            "2e636f6d2f5468655468696e67734e6574776f726b2f6170692f68616e64" .
            "6c6572aa021c5468655468696e67734e6574776f726b2e4150492e48616e" .
            "646c6572620670726f746f33"
        ));

        static::$is_initialized = true;
    }
}


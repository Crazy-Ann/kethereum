// from https://github.com/ethereum/tests/blob/develop/TransactionTests/ttTransactionTest.json

val transactionTestData ="""
{
    "AddressLessThan20" : {
        "blocknumber" : "0",
        "rlp" : "0xf8528001825208870b9331677e6ebf0a801ca098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "AddressLessThan20Prefixed0" : {
        "blocknumber" : "0",
        "hash" : "8aa1f1feb9756643f367a850819d9ba63d721872069a968899c76b8ff895a1c5",
        "rlp" : "0xf85f800182520894000000000000000000000000000b9331677e6ebf0a801ca098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3",
        "sender" : "31bb58672e8bf7684108feeacf424ab62b873824",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x98ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4a",
            "s" : "0x8887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3",
            "to" : "0x000000000000000000000000000b9331677e6ebf",
            "v" : "0x1c",
            "value" : "0x0a"
        }
    },
    "AddressMoreThan20" : {
        "blocknumber" : "0",
        "rlp" : "0xf860800182520895b94f5374fce5edbc8e2a8697c15331677e6ebf0b1c0a801ca098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "AddressMoreThan20PrefixedBy0" : {
        "blocknumber" : "0",
        "rlp" : "0xf867367b8252089c0000000000000000095e7baea6a6c7c4c2dfeb977efac326af552d870b121ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "DataTestEnoughGAS" : {
        "blocknumber" : "0",
        "hash" : "e87d97a66cab8fe9bfd9c2efca416174edc31352e16035fb23c8166bbab1b474",
        "rlp" : "0xf86d80018259d894095e7baea6a6c7c4c2dfeb977efac326af552d870a8e0358ac39584bc98a7c979f984b031ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "ce26839c9bd0e87e38897bb97fca8b340fd12a53",
        "transaction" : {
            "data" : "0x0358ac39584bc98a7c979f984b03",
            "gasLimit" : "0x59d8",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0a"
        }
    },
    "DataTestFirstZeroBytes" : {
        "blocknumber" : "0",
        "hash" : "928bf8a1a43a99b74747ae6c86246a3bb4fc5f647a59c7a4c7673d7e891a51db",
        "rlp" : "0xf87c80018261a894095e7baea6a6c7c4c2dfeb977efac326af552d870a9d00000000000000000000000000010000000000000000000000000000001ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "8131688854fe0dca411aa19572a01fe3e3e4fa74",
        "transaction" : {
            "data" : "0x0000000000000000000000000001000000000000000000000000000000",
            "gasLimit" : "0x61a8",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0a"
        }
    },
    "DataTestLastZeroBytes" : {
        "blocknumber" : "0",
        "hash" : "24e46f946aa16e8c290a9b10ff31d72f9e41261d273b804a2789d82ed85de34d",
        "rlp" : "0xf87c80018261a894095e7baea6a6c7c4c2dfeb977efac326af552d870a9d01000000000000000000000000000000000000000000000000000000001ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "58a93c8f40f721b21dd44c10bfa5d39a3ced78f6",
        "transaction" : {
            "data" : "0x0100000000000000000000000000000000000000000000000000000000",
            "gasLimit" : "0x61a8",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0a"
        }
    },
    "DataTestNotEnoughGAS" : {
        "blocknumber" : "0",
        "rlp" : "0xf86d800182521c94095e7baea6a6c7c4c2dfeb977efac326af552d870a8e0358ac39584bc98a7c979f984b031ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "DataTestZeroBytes" : {
        "blocknumber" : "0",
        "hash" : "48565fb5cabd83a3253eb9fc2e817b79a505df34a78e5d22de253bab76d9d70a",
        "rlp" : "0xf87c80018261a894095e7baea6a6c7c4c2dfeb977efac326af552d870a9d00000000000000000000000000000000000000000000000000000000001ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "b7ab01c0f092d30aeed17e23adb7aa5a9b2ee077",
        "transaction" : {
            "data" : "0x0000000000000000000000000000000000000000000000000000000000",
            "gasLimit" : "0x61a8",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0a"
        }
    },
    "EmptyTransaction" : {
        "blocknumber" : "0",
        "rlp" : "0xf85d80808094095e7baea6a6c7c4c2dfeb977efac326af552d8780801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "NotEnoughGasLimit" : {
        "blocknumber" : "0",
        "rlp" : "0xf85f0301824e2094b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a801ca098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "RSsecp256k1" : {
        "blocknumber" : "0",
        "rlp" : "0xf85f030182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a801ca0fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364141a0fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364141"
    },
    "RightVRSTest" : {
        "blocknumber" : "0",
        "hash" : "1ae041bfa0b77e66e123cdd53c67d8d4533705b94dc637d27e36ae3f5cf7698b",
        "rlp" : "0xf85f030182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a801ca098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3",
        "sender" : "fa7f04899691becd07dd3081d0a2f3ee7640af52",
        "transaction" : {
            "data" : "0x",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x03",
            "r" : "0x98ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4a",
            "s" : "0x8887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3",
            "to" : "0xb94f5374fce5edbc8e2a8697c15331677e6ebf0b",
            "v" : "0x1c",
            "value" : "0x0a"
        }
    },
    "SenderTest" : {
        "blocknumber" : "0",
        "hash" : "41df922fd0d4766fcc02e161f8295ec28522f329ae487f14d811e4b64c8d6e31",
        "rlp" : "0xf85f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870a801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "0f65fe9276bc9a24ae7083ae28e2660ef72df99e",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0a"
        }
    },
    "TransactionWithGasLimitOverflow" : {
        "blocknumber" : "0",
        "rlp" : "0xf87e8001a101000000000000000000000000000000000000000000000000000000000000000094095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "TransactionWithGasLimitOverflow2" : {
        "blocknumber" : "0",
        "hash" : "fb8bdb8c221344a131a0473a3912b9bff281285b47522992b1f298686d0cdb48",
        "rlp" : "0xf865800188800000000000000094095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "6986b102a5375abef1f739a3b5d9baa228a4fca4",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x8000000000000000",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithGasLimitOverflow63" : {
        "blocknumber" : "0",
        "hash" : "fb8bdb8c221344a131a0473a3912b9bff281285b47522992b1f298686d0cdb48",
        "rlp" : "0xf865800188800000000000000094095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "6986b102a5375abef1f739a3b5d9baa228a4fca4",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x8000000000000000",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithGasLimitOverflow63_1" : {
        "blocknumber" : "0",
        "hash" : "f4a1caa6a8a3c08b8fe1528c862e626720298edb7dca2aee3d10ff8a947af12e",
        "rlp" : "0xf865800188800000000000000194095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "41cc818b2cd4606ff8981a38daf7c4f12d40ed28",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x8000000000000001",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithGasLimitxPriceOverflow" : {
        "blocknumber" : "0",
        "hash" : "a69db213eb6bf08e156be0e19903eef0b2624d3ff59b7619be58637090bb43ec",
        "rlp" : "0xf8858088016345785d8a0000a0ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff94095e7baea6a6c7c4c2dfeb977efac326af552d8780801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "700764607c82cf3e9cf4ecbd49185f8914f1a361",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0xffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff",
            "gasPrice" : "0x016345785d8a0000",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x00"
        }
    },
    "TransactionWithGasLimitxPriceOverflow2" : {
        "blocknumber" : "0",
        "hash" : "332613ab7b44cda1652efc59035c6f2c74dfbbe7289f816775796cda08d0d151",
        "rlp" : "0xf86780873b9403b9403b5c8398968094095e7baea6a6c7c4c2dfeb977efac326af552d8780801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "05af62c0a8db23608f68370e503617b32a6ac0d0",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x989680",
            "gasPrice" : "0x3b9403b9403b5c",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x00"
        }
    },
    "TransactionWithGasPriceOverflow" : {
        "blocknumber" : "0",
        "rlp" : "0xf88080a101000000000000000000000000000000000000000000000000000000000000000082520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "TransactionWithHighValueOverflow" : {
        "blocknumber" : "0",
        "rlp" : "0xf880800182520894095e7baea6a6c7c4c2dfeb977efac326af552d87a1010000000000000000000000000000000000000000000000000000000000000000801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "TransactionWithHighGas" : {
        "blocknumber" : "0",
        "hash" : "209466e8f6b969c2075bf546938265a13eee23caf7d59e4d7c4e54c26eb482ec",
        "rlp" : "0xf8658001887fffffffffffffff94095e7baea6a6c7c4c2dfeb977efac326af552d8780801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "03a3ce84aa05891249cde4fff6c82acb009af03f",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x7fffffffffffffff",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x00"
        }
    },
    "TransactionWithHighGasPrice" : {
        "blocknumber" : "0",
        "hash" : "087cd92eb14d7ebb2bf3d094415f99074bc749f2e09846090db5dc6bf2945836",
        "rlp" : "0xf87f80a0ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82520894095e7baea6a6c7c4c2dfeb977efac326af552d8780801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "b10eac078276dc8dbf1753715396d480156236f8",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0xffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x00"
        }
    },
    "TransactionWithHighGasPrice2" : {
        "blocknumber" : "0",
        "hash" : "40bb41d9b8dd1a2a4f26b8f03acfe686fe8097fda4fb8d286a2dbfa63ea374f2",
        "rlp" : "0xf865808698852840a46f82520894095e7baea6a6c7c4c2dfeb977efac326af552d8780801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "d45c1531bf3d368879a474400d1b1f8a0a31b95c",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x98852840a46f",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x00"
        }
    },
    "TransactionWithHighNonce256" : {
        "blocknumber" : "0",
        "hash" : "196f3bee5629874e6510ba5d7f3973d4973571f7e1313da5b084b6a4c8c7a3de",
        "rlp" : "0xf87fa0ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0182520894095e7baea6a6c7c4c2dfeb977efac326af552d8780801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "9b96002788562fefd5ac08d5af877fa738272dc7",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0xffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x00"
        }
    },
    "TransactionWithHighNonce32" : {
        "blocknumber" : "0",
        "hash" : "576d150b0695dee162590ad728c2adea3648def3f7c5d6f8dc984c16d9237633",
        "rlp" : "0xf8648501000000000182520894095e7baea6a6c7c4c2dfeb977efac326af552d8780801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "e86dc346fd8debf719486ff2f9c4c629fe58fc46",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x0100000000",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x00"
        }
    },
    "TransactionWithHighValue" : {
        "blocknumber" : "0",
        "hash" : "ee5f8a70679990f83f562b22e97d7ddd51e56eff519e9fce0c83f66fc5acead9",
        "rlp" : "0xf87f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d87a0ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "396bd0363e26195eeacfedbe54c44f16fbe470b6",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0xffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"
        }
    },
    "TransactionWithNonceOverflow" : {
        "blocknumber" : "0",
        "rlp" : "0xf880a10100000000000000000000000000000000000000000000000000000000000000000182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "TransactionWithRSvalue0" : {
        "blocknumber" : "0",
        "rlp" : "0xdf800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801b8080"
    },
    "TransactionWithRSvalue1" : {
        "blocknumber" : "0",
        "hash" : "7d442ef4740397ced8ba3f0de71405e8d0bd4c4b5b79b20c83374b9949904db4",
        "rlp" : "0xdf800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801b0101",
        "sender" : "98c188f183d4e93ff2bffadd145f39b4a792ed85",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x01",
            "s" : "0x01",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithRvalue0" : {
        "blocknumber" : "0",
        "rlp" : "0xf83f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801b80a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "TransactionWithRvalue1" : {
        "blocknumber" : "0",
        "hash" : "efad4aed615432e8785ca087d3428adeff6ce173df7923b82cbfaf96fe7fe952",
        "rlp" : "0xf83f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801b01a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "421ba7ba39c1c2ddb98308deca3af1dd9e461740",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x01",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithRvalueHigh" : {
        "blocknumber" : "0",
        "rlp" : "0xf85f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba0fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364140a08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "TransactionWithRvalueOverflow" : {
        "blocknumber" : "0",
        "rlp" : "0xf861800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba2fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd03641410000a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "TransactionWithRvaluePrefixed00" : {
        "blocknumber" : "0",
        "hash" : "01edbc8070afd3b214958a9f1a34825f8745895fa3e071a065eb6199e8af129e",
        "rlp" : "0xf850800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801b910ebaaedce6af48a03bbfd25e8cd0364141a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "0dd0dcb6502a463fa90ecaa59ca29a5e6571deef",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0xebaaedce6af48a03bbfd25e8cd0364141",
            "s" : "0xefffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithRvalueTooHigh" : {
        "blocknumber" : "0",
        "rlp" : "0xf85f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba0fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364141a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "TransactionWithSvalue0" : {
        "blocknumber" : "0",
        "rlp" : "0xf83f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a3664935380"
    },
    "TransactionWithSvalue1" : {
        "blocknumber" : "0",
        "hash" : "c766ef7fc21cabd37e346c2ca957a30aa87853b6579917a6d5259fb74b657eea",
        "rlp" : "0xf83f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a3664935301",
        "sender" : "e115cf6bb5656786569dd273705242ca72d84bc0",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0x01",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithSvalueEqual_c_secp256k1n_x05" : {
        "blocknumber" : "0",
        "hash" : "598c2fd732a2a602924a91a5108c1b690c5dee2ecd0b1d3733f0faae92cee470",
        "rlp" : "0xf85f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a07fffffffffffffffffffffffffffffff5d576e7357a4501ddfe92f46681b20a0",
        "sender" : "b284109d8e781949638d995c19f8feba0268191c",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0x7fffffffffffffffffffffffffffffff5d576e7357a4501ddfe92f46681b20a0",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithSvalueHigh" : {
        "blocknumber" : "0",
        "hash" : "c90d3b02eb65a7dd5087b0110c4ae34e9ce146402edc641d6f1d85a5c7a953f9",
        "rlp" : "0xf85f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364140",
        "sender" : "474869ba435affa1f45aaada48520880921c0887",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0xfffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364140",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithSvalueLargerThan_c_secp256k1n_x05" : {
        "blocknumber" : "0",
        "hash" : "aa9b37202f998b5b2145b030d8349f79dad692134a30a2efdba00b9c83ba217a",
        "rlp" : "0xf85f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a07fffffffffffffffffffffffffffffff5d576e7357a4501ddfe92f46681b20a1",
        "sender" : "5ced92a94a7bfd7853b12d33ee59dd10ae94eb86",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0x7fffffffffffffffffffffffffffffff5d576e7357a4501ddfe92f46681b20a1",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithSvalueLessThan_c_secp256k1n_x05" : {
        "blocknumber" : "0",
        "hash" : "0e16a207e6274d78cae05e4ea51bd9bab0ae355b7daecd5d2977a1ae6a233dcd",
        "rlp" : "0xf85f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a07fffffffffffffffffffffffffffffff5d576e7357a4501ddfe92f46681b2090",
        "sender" : "33e931e187e9cb5b6f8560755519d54560dd63e8",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x48b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353",
            "s" : "0x7fffffffffffffffffffffffffffffff5d576e7357a4501ddfe92f46681b2090",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithSvalueOverflow" : {
        "blocknumber" : "0",
        "rlp" : "0xf861800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a2fffffffffffffffffffffffffffffffffffffffffffffffffffffffefffffc2f0000"
    },
    "TransactionWithSvaluePrefixed00" : {
        "blocknumber" : "0",
        "hash" : "e105dd8e6927c4c27d69b5c3926a521208181ed830134685293479b05729ae54",
        "rlp" : "0xf851800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4a920ef0b28ad43601b4ab949f53faa07bd2c804",
        "sender" : "a825d77f343f31619c991cd7db5aaa6adbe9452e",
        "transaction" : {
            "data" : "",
            "gasLimit" : "0x5208",
            "gasPrice" : "0x01",
            "nonce" : "0x00",
            "r" : "0x98ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4a",
            "s" : "0xef0b28ad43601b4ab949f53faa07bd2c804",
            "to" : "0x095e7baea6a6c7c4c2dfeb977efac326af552d87",
            "v" : "0x1b",
            "value" : "0x0b"
        }
    },
    "TransactionWithSvalueTooHigh" : {
        "blocknumber" : "0",
        "rlp" : "0xf85f800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870b801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364141"
    },
    "TransactionWithTooFewRLPElements" : {
        "blocknumber" : "0",
        "rlp" : "0xf85b800194095e7baea6a6c7c4c2dfeb977efac326af552d87801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804"
    },
    "TransactionWithTooManyRLPElements" : {
        "blocknumber" : "0",
        "rlp" : "0xf865800182520894095e7baea6a6c7c4c2dfeb977efac326af552d870a801ba048b55bfa915ac795c431978d8a6a992b628d557da5ff759b307d495a36649353a0efffd310ac743f371de3b9f7f9cb56c0b28ad43601b4ab949f53faa07bd2c804851de98d0edd"
    },
    "V_overflow32bit" : {
        "blocknumber" : "0",
        "rlp" : "0xf866030182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a82554485010000001ba098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "V_overflow32bitSigned" : {
        "blocknumber" : "0",
        "rlp" : "0xf865030182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a825544847fffffffa098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "V_overflow64bitPlus27" : {
        "blocknumber" : "0",
        "rlp" : "0xf86a03018255f094b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a8255448901000000000000001ba098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "V_overflow64bitPlus28" : {
        "blocknumber" : "0",
        "rlp" : "0xf86a03018255f094b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a8255448901000000000000001ca098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "V_overflow64bitSigned" : {
        "blocknumber" : "0",
        "rlp" : "0xf869030182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a82554488ffffffffffffff1ca098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "WrongVRSTestIncorrectSize" : {
        "blocknumber" : "0",
        "rlp" : "0xf863800182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a801ca298ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4a02c3a28887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a302c3"
    },
    "WrongVRSTestVEqual26" : {
        "blocknumber" : "0",
        "rlp" : "0xf85f800182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a801aa098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "WrongVRSTestVEqual29" : {
        "blocknumber" : "0",
        "rlp" : "0xf85f800182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a801da098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "WrongVRSTestVEqual31" : {
        "blocknumber" : "0",
        "rlp" : "0xf85f800182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a801fa098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "WrongVRSTestVOverflow" : {
        "blocknumber" : "0",
        "rlp" : "0xf861800182520894b94f5374fce5edbc8e2a8697c15331677e6ebf0b0a80820136a098ff921201554726367d2be8c804a7ff89ccf285ebc57dff8ae4c44b9c19ac4aa08887321be575c8095f789dd4c743dfe42c1820f9231f98a962b210e3ac2452a3"
    },
    "dataTx_bcValidBlockTest" : {
        "blocknumber" : "0",
        "hash" : "7b9381d1c2a1869f5b3532f38b0a5f0f89f09009f06308f2f1aa030b3b80749b",
        "rlp" : "0xf901fb803282c3508080b901ae60056013565b6101918061001d6000396000f35b3360008190555056006001600060e060020a6000350480630a874df61461003a57806341c0e1b514610058578063a02b161e14610066578063dbbdf0831461007757005b610045600435610149565b80600160a060020a031660005260206000f35b610060610161565b60006000f35b6100716004356100d4565b60006000f35b61008560043560243561008b565b60006000f35b600054600160a060020a031632600160a060020a031614156100ac576100b1565b6100d0565b8060018360005260205260406000208190555081600060005260206000a15b5050565b600054600160a060020a031633600160a060020a031614158015610118575033600160a060020a0316600182600052602052604060002054600160a060020a031614155b61012157610126565b610146565b600060018260005260205260406000208190555080600060005260206000a15b50565b60006001826000526020526040600020549050919050565b600054600160a060020a031633600160a060020a0316146101815761018f565b600054600160a060020a0316ff5b561ca0c5689ed1ad124753d54576dfb4b571465a41900a1dff4058d8adf16f752013d0a0e221cbd70ec28c94a3b55ec771bcbc70778d6ee0b51ca7ea9514594c861b1884",
        "sender" : "a94f5374fce5edbc8e2a8697c15331677e6ebf0b",
        "transaction" : {
            "data" : "0x60056013565b6101918061001d6000396000f35b3360008190555056006001600060e060020a6000350480630a874df61461003a57806341c0e1b514610058578063a02b161e14610066578063dbbdf0831461007757005b610045600435610149565b80600160a060020a031660005260206000f35b610060610161565b60006000f35b6100716004356100d4565b60006000f35b61008560043560243561008b565b60006000f35b600054600160a060020a031632600160a060020a031614156100ac576100b1565b6100d0565b8060018360005260205260406000208190555081600060005260206000a15b5050565b600054600160a060020a031633600160a060020a031614158015610118575033600160a060020a0316600182600052602052604060002054600160a060020a031614155b61012157610126565b610146565b600060018260005260205260406000208190555080600060005260206000a15b50565b60006001826000526020526040600020549050919050565b600054600160a060020a031633600160a060020a0316146101815761018f565b600054600160a060020a0316ff5b56",
            "gasLimit" : "0xc350",
            "gasPrice" : "0x32",
            "nonce" : "0x00",
            "r" : "0xc5689ed1ad124753d54576dfb4b571465a41900a1dff4058d8adf16f752013d0",
            "s" : "0xe221cbd70ec28c94a3b55ec771bcbc70778d6ee0b51ca7ea9514594c861b1884",
            "to" : "",
            "v" : "0x1c",
            "value" : "0x00"
        }
    },
    "invalidSignature" : {
        "blocknumber" : "0",
        "rlp" : "0xf8638080830f424094095e7baea6a6c7c4c2dfeb977efac326af552d87830186a0801ba0ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffa0badf00d70ec28c94a3b55ec771bcbc70778d6ee0b51ca7ea9514594c861b1884"
    },
    "libsecp256k1test" : {
        "blocknumber" : "0",
        "hash" : "ba09edc1275a285fb27bfe82c4eea240a907a0dbaf9e55764b8f318c37d5974f",
        "rlp" : "0xd1808609184e72a00082f3888080801b2c04",
        "sender" : "170ad78f26da62f591fa3fe3d54c30016167cbbf",
        "transaction" : {
            "data" : "0x",
            "gasLimit" : "0xf388",
            "gasPrice" : "0x09184e72a000",
            "nonce" : "0x00",
            "r" : "0x2c",
            "s" : "0x04",
            "to" : "",
            "v" : "0x1b",
            "value" : "0x00"
        }
    },
    "unpadedRValue" : {
        "blocknumber" : "0",
        "hash" : "63bbd64e9ee62976d0b8633c00d482905163a0a6038d819ccf771e10cbbed6c5",
        "rlp" : "0xf8880d8609184e72a00082f710947c47ef93268a311f4cad0c750724299e9b72c26880a4379607f500000000000000000000000000000000000000000000000000000000000000051c9f6ab6dda9f4df56ea45583af36660329147f1753f3724ea5eb9ed83e812ca77a0495701e230667832c8999e884e366a61028633ecf951e8cd66d119f381ae5718",
        "sender" : "c1584838993ee7a9581cba0bced81785e8bb581d",
        "transaction" : {
            "data" : "0x379607f50000000000000000000000000000000000000000000000000000000000000005",
            "gasLimit" : "0xf710",
            "gasPrice" : "0x09184e72a000",
            "nonce" : "0x0d",
            "r" : "0x006ab6dda9f4df56ea45583af36660329147f1753f3724ea5eb9ed83e812ca77",
            "s" : "0x495701e230667832c8999e884e366a61028633ecf951e8cd66d119f381ae5718",
            "to" : "0x7c47ef93268a311f4cad0c750724299e9b72c268",
            "v" : "0x1c",
            "value" : "0x00"
        }
    }
}
        """
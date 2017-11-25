// Cargo 1


{
  "@context": [
    {
      "gr": "http://purl.org/goodrelations/v1#",
      "pto": "http://www.productontology.org/id/",
      "foaf": "http://xmlns.com/foaf/0.1/",
      "xsd": "http://www.w3.org/2001/XMLSchema#",
      "foaf:page": {
        "@type": "@id"
      },
      "gr:acceptedPaymentMethods": {
        "@type": "@id"
      },
      "gr:hasBusinessFunction": {
        "@type": "@id"
      },
      "gr:hasCurrencyValue": {
        "@type": "xsd:float"
      }
    },
    "https://w3id.org/security/v1"
  ],
  "@id": "http://array.network/cargo/3133",
  "@type": "gr:Cargo_Transit",
  "gr:name": "Cargo for Cross-Docking",
  "gr:description": "Cargo",
  "gr:hasBusinessFunction": "gr:Transport",
  "gr:hasPriceSpecification": {
    "gr:hasCurrencyValue": "10000",
    "gr:hasCurrency": "USD"
  },
  "gr:includes": {
    "@type": [
      "gr:Individual",
      "pto:Vehicle"
    ],
    "gr:name": "Cargo for Distribution",
    "foaf:page": "array.network/cargo"
  },
  "signature": {
    "type": "EcdsaKoblitzSignature2016",
    "created": "2017-11-12T15:48:09Z",
    "creator": "ecdsa-koblitz-pubkey:1LGpGhGK8whX23ZNdxrgtjKrek9rP4xWER",
    "signatureValue": "H8HDdm+3F5qZawH8jJoZc8q4giGxbxjGsW+wczfiSPXMeuWMzlxCKxA9R24z75oXo7BdfZBG9u0TgSZGHJD3GoI="
  }
}

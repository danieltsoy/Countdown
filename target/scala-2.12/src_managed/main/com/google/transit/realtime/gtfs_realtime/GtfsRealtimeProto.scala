// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.transit.realtime.gtfs_realtime

object GtfsRealtimeProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.google.transit.realtime.gtfs_realtime.FeedMessage,
      com.google.transit.realtime.gtfs_realtime.FeedHeader,
      com.google.transit.realtime.gtfs_realtime.FeedEntity,
      com.google.transit.realtime.gtfs_realtime.TripUpdate,
      com.google.transit.realtime.gtfs_realtime.VehiclePosition,
      com.google.transit.realtime.gtfs_realtime.Alert,
      com.google.transit.realtime.gtfs_realtime.TimeRange,
      com.google.transit.realtime.gtfs_realtime.Position,
      com.google.transit.realtime.gtfs_realtime.TripDescriptor,
      com.google.transit.realtime.gtfs_realtime.VehicleDescriptor,
      com.google.transit.realtime.gtfs_realtime.EntitySelector,
      com.google.transit.realtime.gtfs_realtime.TranslatedString
    )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChNndGZzLXJlYWx0aW1lLnByb3RvEhB0cmFuc2l0X3JlYWx0aW1lIpsBCgtGZWVkTWVzc2FnZRJBCgZoZWFkZXIYASACKAsyH
  C50cmFuc2l0X3JlYWx0aW1lLkZlZWRIZWFkZXJCC+I/CBIGaGVhZGVyUgZoZWFkZXISQQoGZW50aXR5GAIgAygLMhwudHJhbnNpd
  F9yZWFsdGltZS5GZWVkRW50aXR5QgviPwgSBmVudGl0eVIGZW50aXR5KgYI6AcQ0A8ivgIKCkZlZWRIZWFkZXISTAoVZ3Rmc19yZ
  WFsdGltZV92ZXJzaW9uGAEgAigJQhjiPxUSE2d0ZnNSZWFsdGltZVZlcnNpb25SE2d0ZnNSZWFsdGltZVZlcnNpb24SdgoOaW5jc
  mVtZW50YWxpdHkYAiABKA4yKy50cmFuc2l0X3JlYWx0aW1lLkZlZWRIZWFkZXIuSW5jcmVtZW50YWxpdHk6DEZVTExfREFUQVNFV
  EIT4j8QEg5pbmNyZW1lbnRhbGl0eVIOaW5jcmVtZW50YWxpdHkSLAoJdGltZXN0YW1wGAMgASgEQg7iPwsSCXRpbWVzdGFtcFIJd
  GltZXN0YW1wIjQKDkluY3JlbWVudGFsaXR5EhAKDEZVTExfREFUQVNFVBAAEhAKDERJRkZFUkVOVElBTBABKgYI6AcQ0A8iuQIKC
  kZlZWRFbnRpdHkSFwoCaWQYASACKAlCB+I/BBICaWRSAmlkEjQKCmlzX2RlbGV0ZWQYAiABKAg6BWZhbHNlQg7iPwsSCWlzRGVsZ
  XRlZFIJaXNEZWxldGVkEk4KC3RyaXBfdXBkYXRlGAMgASgLMhwudHJhbnNpdF9yZWFsdGltZS5UcmlwVXBkYXRlQg/iPwwSCnRya
  XBVcGRhdGVSCnRyaXBVcGRhdGUSSQoHdmVoaWNsZRgEIAEoCzIhLnRyYW5zaXRfcmVhbHRpbWUuVmVoaWNsZVBvc2l0aW9uQgziP
  wkSB3ZlaGljbGVSB3ZlaGljbGUSOQoFYWxlcnQYBSABKAsyFy50cmFuc2l0X3JlYWx0aW1lLkFsZXJ0QgriPwcSBWFsZXJ0UgVhb
  GVydCoGCOgHENAPIvMHCgpUcmlwVXBkYXRlEj8KBHRyaXAYASACKAsyIC50cmFuc2l0X3JlYWx0aW1lLlRyaXBEZXNjcmlwdG9yQ
  gniPwYSBHRyaXBSBHRyaXASSwoHdmVoaWNsZRgDIAEoCzIjLnRyYW5zaXRfcmVhbHRpbWUuVmVoaWNsZURlc2NyaXB0b3JCDOI/C
  RIHdmVoaWNsZVIHdmVoaWNsZRJqChBzdG9wX3RpbWVfdXBkYXRlGAIgAygLMisudHJhbnNpdF9yZWFsdGltZS5UcmlwVXBkYXRlL
  lN0b3BUaW1lVXBkYXRlQhPiPxASDnN0b3BUaW1lVXBkYXRlUg5zdG9wVGltZVVwZGF0ZRIsCgl0aW1lc3RhbXAYBCABKARCDuI/C
  xIJdGltZXN0YW1wUgl0aW1lc3RhbXASIAoFZGVsYXkYBSABKAVCCuI/BxIFZGVsYXlSBWRlbGF5GowBCg1TdG9wVGltZUV2ZW50E
  iAKBWRlbGF5GAEgASgFQgriPwcSBWRlbGF5UgVkZWxheRIdCgR0aW1lGAIgASgDQgniPwYSBHRpbWVSBHRpbWUSMgoLdW5jZXJ0Y
  WludHkYAyABKAVCEOI/DRILdW5jZXJ0YWludHlSC3VuY2VydGFpbnR5KgYI6AcQ0A8agwQKDlN0b3BUaW1lVXBkYXRlEjYKDXN0b
  3Bfc2VxdWVuY2UYASABKA1CEeI/DhIMc3RvcFNlcXVlbmNlUgxzdG9wU2VxdWVuY2USJAoHc3RvcF9pZBgEIAEoCUIL4j8IEgZzd
  G9wSWRSBnN0b3BJZBJSCgdhcnJpdmFsGAIgASgLMioudHJhbnNpdF9yZWFsdGltZS5UcmlwVXBkYXRlLlN0b3BUaW1lRXZlbnRCD
  OI/CRIHYXJyaXZhbFIHYXJyaXZhbBJYCglkZXBhcnR1cmUYAyABKAsyKi50cmFuc2l0X3JlYWx0aW1lLlRyaXBVcGRhdGUuU3Rvc
  FRpbWVFdmVudEIO4j8LEglkZXBhcnR1cmVSCWRlcGFydHVyZRKbAQoVc2NoZWR1bGVfcmVsYXRpb25zaGlwGAUgASgOMkAudHJhb
  nNpdF9yZWFsdGltZS5UcmlwVXBkYXRlLlN0b3BUaW1lVXBkYXRlLlNjaGVkdWxlUmVsYXRpb25zaGlwOglTQ0hFRFVMRURCGeI/F
  hIUc2NoZWR1bGVSZWxhdGlvbnNoaXBSFHNjaGVkdWxlUmVsYXRpb25zaGlwIj8KFFNjaGVkdWxlUmVsYXRpb25zaGlwEg0KCVNDS
  EVEVUxFRBAAEgsKB1NLSVBQRUQQARILCgdOT19EQVRBEAIqBgjoBxDQDyoGCOgHENAPIvEICg9WZWhpY2xlUG9zaXRpb24SPwoEd
  HJpcBgBIAEoCzIgLnRyYW5zaXRfcmVhbHRpbWUuVHJpcERlc2NyaXB0b3JCCeI/BhIEdHJpcFIEdHJpcBJLCgd2ZWhpY2xlGAggA
  SgLMiMudHJhbnNpdF9yZWFsdGltZS5WZWhpY2xlRGVzY3JpcHRvckIM4j8JEgd2ZWhpY2xlUgd2ZWhpY2xlEkUKCHBvc2l0aW9uG
  AIgASgLMhoudHJhbnNpdF9yZWFsdGltZS5Qb3NpdGlvbkIN4j8KEghwb3NpdGlvblIIcG9zaXRpb24STAoVY3VycmVudF9zdG9wX
  3NlcXVlbmNlGAMgASgNQhjiPxUSE2N1cnJlbnRTdG9wU2VxdWVuY2VSE2N1cnJlbnRTdG9wU2VxdWVuY2USJAoHc3RvcF9pZBgHI
  AEoCUIL4j8IEgZzdG9wSWRSBnN0b3BJZBJ9Cg5jdXJyZW50X3N0YXR1cxgEIAEoDjIzLnRyYW5zaXRfcmVhbHRpbWUuVmVoaWNsZ
  VBvc2l0aW9uLlZlaGljbGVTdG9wU3RhdHVzOg1JTl9UUkFOU0lUX1RPQhLiPw8SDWN1cnJlbnRTdGF0dXNSDWN1cnJlbnRTdGF0d
  XMSLAoJdGltZXN0YW1wGAUgASgEQg7iPwsSCXRpbWVzdGFtcFIJdGltZXN0YW1wEnIKEGNvbmdlc3Rpb25fbGV2ZWwYBiABKA4yM
  S50cmFuc2l0X3JlYWx0aW1lLlZlaGljbGVQb3NpdGlvbi5Db25nZXN0aW9uTGV2ZWxCFOI/ERIPY29uZ2VzdGlvbkxldmVsUg9jb
  25nZXN0aW9uTGV2ZWwScgoQb2NjdXBhbmN5X3N0YXR1cxgJIAEoDjIxLnRyYW5zaXRfcmVhbHRpbWUuVmVoaWNsZVBvc2l0aW9uL
  k9jY3VwYW5jeVN0YXR1c0IU4j8REg9vY2N1cGFuY3lTdGF0dXNSD29jY3VwYW5jeVN0YXR1cyJHChFWZWhpY2xlU3RvcFN0YXR1c
  xIPCgtJTkNPTUlOR19BVBAAEg4KClNUT1BQRURfQVQQARIRCg1JTl9UUkFOU0lUX1RPEAIifQoPQ29uZ2VzdGlvbkxldmVsEhwKG
  FVOS05PV05fQ09OR0VTVElPTl9MRVZFTBAAEhQKEFJVTk5JTkdfU01PT1RITFkQARIPCgtTVE9QX0FORF9HTxACEg4KCkNPTkdFU
  1RJT04QAxIVChFTRVZFUkVfQ09OR0VTVElPThAEIq8BCg9PY2N1cGFuY3lTdGF0dXMSCQoFRU1QVFkQABIYChRNQU5ZX1NFQVRTX
  0FWQUlMQUJMRRABEhcKE0ZFV19TRUFUU19BVkFJTEFCTEUQAhIWChJTVEFORElOR19ST09NX09OTFkQAxIeChpDUlVTSEVEX1NUQ
  U5ESU5HX1JPT01fT05MWRAEEggKBEZVTEwQBRIcChhOT1RfQUNDRVBUSU5HX1BBU1NFTkdFUlMQBioGCOgHENAPIvcHCgVBbGVyd
  BJTCg1hY3RpdmVfcGVyaW9kGAEgAygLMhsudHJhbnNpdF9yZWFsdGltZS5UaW1lUmFuZ2VCEeI/DhIMYWN0aXZlUGVyaW9kUgxhY
  3RpdmVQZXJpb2QSXgoPaW5mb3JtZWRfZW50aXR5GAUgAygLMiAudHJhbnNpdF9yZWFsdGltZS5FbnRpdHlTZWxlY3RvckIT4j8QE
  g5pbmZvcm1lZEVudGl0eVIOaW5mb3JtZWRFbnRpdHkSTgoFY2F1c2UYBiABKA4yHS50cmFuc2l0X3JlYWx0aW1lLkFsZXJ0LkNhd
  XNlOg1VTktOT1dOX0NBVVNFQgriPwcSBWNhdXNlUgVjYXVzZRJTCgZlZmZlY3QYByABKA4yHi50cmFuc2l0X3JlYWx0aW1lLkFsZ
  XJ0LkVmZmVjdDoOVU5LTk9XTl9FRkZFQ1RCC+I/CBIGZWZmZWN0UgZlZmZlY3QSPgoDdXJsGAggASgLMiIudHJhbnNpdF9yZWFsd
  GltZS5UcmFuc2xhdGVkU3RyaW5nQgjiPwUSA3VybFIDdXJsElQKC2hlYWRlcl90ZXh0GAogASgLMiIudHJhbnNpdF9yZWFsdGltZ
  S5UcmFuc2xhdGVkU3RyaW5nQg/iPwwSCmhlYWRlclRleHRSCmhlYWRlclRleHQSYwoQZGVzY3JpcHRpb25fdGV4dBgLIAEoCzIiL
  nRyYW5zaXRfcmVhbHRpbWUuVHJhbnNsYXRlZFN0cmluZ0IU4j8REg9kZXNjcmlwdGlvblRleHRSD2Rlc2NyaXB0aW9uVGV4dCLYA
  QoFQ2F1c2USEQoNVU5LTk9XTl9DQVVTRRABEg8KC09USEVSX0NBVVNFEAISFQoRVEVDSE5JQ0FMX1BST0JMRU0QAxIKCgZTVFJJS
  0UQBBIRCg1ERU1PTlNUUkFUSU9OEAUSDAoIQUNDSURFTlQQBhILCgdIT0xJREFZEAcSCwoHV0VBVEhFUhAIEg8KC01BSU5URU5BT
  kNFEAkSEAoMQ09OU1RSVUNUSU9OEAoSEwoPUE9MSUNFX0FDVElWSVRZEAsSFQoRTUVESUNBTF9FTUVSR0VOQ1kQDCK1AQoGRWZmZ
  WN0Eg4KCk5PX1NFUlZJQ0UQARITCg9SRURVQ0VEX1NFUlZJQ0UQAhIWChJTSUdOSUZJQ0FOVF9ERUxBWVMQAxIKCgZERVRPVVIQB
  BIWChJBRERJVElPTkFMX1NFUlZJQ0UQBRIUChBNT0RJRklFRF9TRVJWSUNFEAYSEAoMT1RIRVJfRUZGRUNUEAcSEgoOVU5LTk9XT
  l9FRkZFQ1QQCBIOCgpTVE9QX01PVkVEEAkqBgjoBxDQDyJRCglUaW1lUmFuZ2USIAoFc3RhcnQYASABKARCCuI/BxIFc3RhcnRSB
  XN0YXJ0EhoKA2VuZBgCIAEoBEII4j8FEgNlbmRSA2VuZCoGCOgHENAPIuABCghQb3NpdGlvbhIpCghsYXRpdHVkZRgBIAIoAkIN4
  j8KEghsYXRpdHVkZVIIbGF0aXR1ZGUSLAoJbG9uZ2l0dWRlGAIgAigCQg7iPwsSCWxvbmdpdHVkZVIJbG9uZ2l0dWRlEiYKB2JlY
  XJpbmcYAyABKAJCDOI/CRIHYmVhcmluZ1IHYmVhcmluZxIpCghvZG9tZXRlchgEIAEoAUIN4j8KEghvZG9tZXRlclIIb2RvbWV0Z
  XISIAoFc3BlZWQYBSABKAJCCuI/BxIFc3BlZWRSBXNwZWVkKgYI6AcQ0A8i0wMKDlRyaXBEZXNjcmlwdG9yEiQKB3RyaXBfaWQYA
  SABKAlCC+I/CBIGdHJpcElkUgZ0cmlwSWQSJwoIcm91dGVfaWQYBSABKAlCDOI/CRIHcm91dGVJZFIHcm91dGVJZBIzCgxkaXJlY
  3Rpb25faWQYBiABKA1CEOI/DRILZGlyZWN0aW9uSWRSC2RpcmVjdGlvbklkEi0KCnN0YXJ0X3RpbWUYAiABKAlCDuI/CxIJc3Rhc
  nRUaW1lUglzdGFydFRpbWUSLQoKc3RhcnRfZGF0ZRgDIAEoCUIO4j8LEglzdGFydERhdGVSCXN0YXJ0RGF0ZRKFAQoVc2NoZWR1b
  GVfcmVsYXRpb25zaGlwGAQgASgOMjUudHJhbnNpdF9yZWFsdGltZS5UcmlwRGVzY3JpcHRvci5TY2hlZHVsZVJlbGF0aW9uc2hpc
  EIZ4j8WEhRzY2hlZHVsZVJlbGF0aW9uc2hpcFIUc2NoZWR1bGVSZWxhdGlvbnNoaXAiTwoUU2NoZWR1bGVSZWxhdGlvbnNoaXASD
  QoJU0NIRURVTEVEEAASCQoFQURERUQQARIPCgtVTlNDSEVEVUxFRBACEgwKCENBTkNFTEVEEAMqBgjoBxDQDyKOAQoRVmVoaWNsZ
  URlc2NyaXB0b3ISFwoCaWQYASABKAlCB+I/BBICaWRSAmlkEiAKBWxhYmVsGAIgASgJQgriPwcSBWxhYmVsUgVsYWJlbBI2Cg1sa
  WNlbnNlX3BsYXRlGAMgASgJQhHiPw4SDGxpY2Vuc2VQbGF0ZVIMbGljZW5zZVBsYXRlKgYI6AcQ0A8igwIKDkVudGl0eVNlbGVjd
  G9yEioKCWFnZW5jeV9pZBgBIAEoCUIN4j8KEghhZ2VuY3lJZFIIYWdlbmN5SWQSJwoIcm91dGVfaWQYAiABKAlCDOI/CRIHcm91d
  GVJZFIHcm91dGVJZBItCgpyb3V0ZV90eXBlGAMgASgFQg7iPwsSCXJvdXRlVHlwZVIJcm91dGVUeXBlEj8KBHRyaXAYBCABKAsyI
  C50cmFuc2l0X3JlYWx0aW1lLlRyaXBEZXNjcmlwdG9yQgniPwYSBHRyaXBSBHRyaXASJAoHc3RvcF9pZBgFIAEoCUIL4j8IEgZzd
  G9wSWRSBnN0b3BJZCoGCOgHENAPIt8BChBUcmFuc2xhdGVkU3RyaW5nEmIKC3RyYW5zbGF0aW9uGAEgAygLMi4udHJhbnNpdF9yZ
  WFsdGltZS5UcmFuc2xhdGVkU3RyaW5nLlRyYW5zbGF0aW9uQhDiPw0SC3RyYW5zbGF0aW9uUgt0cmFuc2xhdGlvbhpfCgtUcmFuc
  2xhdGlvbhIdCgR0ZXh0GAEgAigJQgniPwYSBHRleHRSBHRleHQSKQoIbGFuZ3VhZ2UYAiABKAlCDeI/ChIIbGFuZ3VhZ2VSCGxhb
  md1YWdlKgYI6AcQ0A8qBgjoBxDQD0IdChtjb20uZ29vZ2xlLnRyYW5zaXQucmVhbHRpbWU="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}
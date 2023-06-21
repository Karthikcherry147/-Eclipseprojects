package model;

import java.util.ArrayList;
import java.util.List;

public class einvoice_model
{
	 private String Version;
	 List <Object> ItemList = new ArrayList < Object > ();
	 ValDtls ValDtlsObject;
	 SellerDtls SellerDtlsObject;
	 DocDtls DocDtlsObject;
	 BuyerDtls BuyerDtlsObject;
	 TranDtls TranDtlsObject;


	 // Getter Methods

	 public String getVersion() {
	  return Version;
	 }

	 public ValDtls getValDtls() {
	  return ValDtlsObject;
	 }

	 public SellerDtls getSellerDtls() {
	  return SellerDtlsObject;
	 }

	 public DocDtls getDocDtls() {
	  return DocDtlsObject;
	 }

	 public BuyerDtls getBuyerDtls() {
	  return BuyerDtlsObject;
	 }

	 public TranDtls getTranDtls() {
	  return TranDtlsObject;
	 }

	 // Setter Methods

	 public void setVersion(String Version) {
	  this.Version = Version;
	 }

	 public void setValDtls(ValDtls ValDtlsObject) {
	  this.ValDtlsObject = ValDtlsObject;
	 }

	 public void setSellerDtls(SellerDtls SellerDtlsObject) {
	  this.SellerDtlsObject = SellerDtlsObject;
	 }

	 public void setDocDtls(DocDtls DocDtlsObject) {
	  this.DocDtlsObject = DocDtlsObject;
	 }

	 public void setBuyerDtls(BuyerDtls BuyerDtlsObject) {
	  this.BuyerDtlsObject = BuyerDtlsObject;
	 }

	 public void setTranDtls(TranDtls TranDtlsObject) {
	  this.TranDtlsObject = TranDtlsObject;
	 }

	public class TranDtls {
	 private String IgstOnIntra;
	 private String RegRev = null;
	 private String EcmGstin = null;
	 private String TaxSch;
	 private String SupTyp;


	 // Getter Methods

	 public String getIgstOnIntra() {
	  return IgstOnIntra;
	 }

	 public String getRegRev() {
	  return RegRev;
	 }

	 public String getEcmGstin() {
	  return EcmGstin;
	 }

	 public String getTaxSch() {
	  return TaxSch;
	 }

	 public String getSupTyp() {
	  return SupTyp;
	 }

	 // Setter Methods

	 public void setIgstOnIntra(String IgstOnIntra) {
	  this.IgstOnIntra = IgstOnIntra;
	 }

	 public void setRegRev(String RegRev) {
	  this.RegRev = RegRev;
	 }

	 public void setEcmGstin(String EcmGstin) {
	  this.EcmGstin = EcmGstin;
	 }

	 public void setTaxSch(String TaxSch) {
	  this.TaxSch = TaxSch;
	 }

	 public void setSupTyp(String SupTyp) {
	  this.SupTyp = SupTyp;
	 }
	}
	public class BuyerDtls {
	 private String TrdNm;
	 private String Loc;
	 private String Addr1;
	 private String Gstin;
	 private String Addr2;
	 private float Pin;
	 private String Pos;
	 private String Stcd;
	 private String Ph;
	 private String Em;
	 private String LglNm;


	 // Getter Methods

	 public String getTrdNm() {
	  return TrdNm;
	 }

	 public String getLoc() {
	  return Loc;
	 }

	 public String getAddr1() {
	  return Addr1;
	 }

	 public String getGstin() {
	  return Gstin;
	 }

	 public String getAddr2() {
	  return Addr2;
	 }

	 public float getPin() {
	  return Pin;
	 }

	 public String getPos() {
	  return Pos;
	 }

	 public String getStcd() {
	  return Stcd;
	 }

	 public String getPh() {
	  return Ph;
	 }

	 public String getEm() {
	  return Em;
	 }

	 public String getLglNm() {
	  return LglNm;
	 }

	 // Setter Methods

	 public void setTrdNm(String TrdNm) {
	  this.TrdNm = TrdNm;
	 }

	 public void setLoc(String Loc) {
	  this.Loc = Loc;
	 }

	 public void setAddr1(String Addr1) {
	  this.Addr1 = Addr1;
	 }

	 public void setGstin(String Gstin) {
	  this.Gstin = Gstin;
	 }

	 public void setAddr2(String Addr2) {
	  this.Addr2 = Addr2;
	 }

	 public void setPin(float Pin) {
	  this.Pin = Pin;
	 }

	 public void setPos(String Pos) {
	  this.Pos = Pos;
	 }

	 public void setStcd(String Stcd) {
	  this.Stcd = Stcd;
	 }

	 public void setPh(String Ph) {
	  this.Ph = Ph;
	 }

	 public void setEm(String Em) {
	  this.Em = Em;
	 }

	 public void setLglNm(String LglNm) {
	  this.LglNm = LglNm;
	 }
	}
	public class DocDtls {
	 private String Dt;
	 private String No;
	 private String Typ;


	 // Getter Methods

	 public String getDt() {
	  return Dt;
	 }

	 public String getNo() {
	  return No;
	 }

	 public String getTyp() {
	  return Typ;
	 }

	 // Setter Methods

	 public void setDt(String Dt) {
	  this.Dt = Dt;
	 }

	 public void setNo(String No) {
	  this.No = No;
	 }

	 public void setTyp(String Typ) {
	  this.Typ = Typ;
	 }
	}
	public class SellerDtls {
	 private String TrdNm;
	 private String Loc;
	 private String Addr1;
	 private String Gstin;
	 private String Addr2;
	 private float Pin;
	 private String Stcd;
	 private String Ph;
	 private String Em;
	 private String LglNm;


	 // Getter Methods

	 public String getTrdNm() {
	  return TrdNm;
	 }

	 public String getLoc() {
	  return Loc;
	 }

	 public String getAddr1() {
	  return Addr1;
	 }

	 public String getGstin() {
	  return Gstin;
	 }

	 public String getAddr2() {
	  return Addr2;
	 }

	 public float getPin() {
	  return Pin;
	 }

	 public String getStcd() {
	  return Stcd;
	 }

	 public String getPh() {
	  return Ph;
	 }

	 public String getEm() {
	  return Em;
	 }

	 public String getLglNm() {
	  return LglNm;
	 }

	 // Setter Methods

	 public void setTrdNm(String TrdNm) {
	  this.TrdNm = TrdNm;
	 }

	 public void setLoc(String Loc) {
	  this.Loc = Loc;
	 }

	 public void setAddr1(String Addr1) {
	  this.Addr1 = Addr1;
	 }

	 public void setGstin(String Gstin) {
	  this.Gstin = Gstin;
	 }

	 public void setAddr2(String Addr2) {
	  this.Addr2 = Addr2;
	 }

	 public void setPin(float Pin) {
	  this.Pin = Pin;
	 }

	 public void setStcd(String Stcd) {
	  this.Stcd = Stcd;
	 }

	 public void setPh(String Ph) {
	  this.Ph = Ph;
	 }

	 public void setEm(String Em) {
	  this.Em = Em;
	 }

	 public void setLglNm(String LglNm) {
	  this.LglNm = LglNm;
	 }
	}
	public class ValDtls {
	 private float CgstVal;
	 private float Discount;
	 private float AssVal;
	 private float OthChrg;
	 private float IgstVal;
	 private float RndOffAmt;
	 private float CesVal;
	 private float TotInvVal;
	 private float StCesVal;
	 private float SgstVal;


	 // Getter Methods

	 public float getCgstVal() {
	  return CgstVal;
	 }

	 public float getDiscount() {
	  return Discount;
	 }

	 public float getAssVal() {
	  return AssVal;
	 }

	 public float getOthChrg() {
	  return OthChrg;
	 }

	 public float getIgstVal() {
	  return IgstVal;
	 }

	 public float getRndOffAmt() {
	  return RndOffAmt;
	 }

	 public float getCesVal() {
	  return CesVal;
	 }

	 public float getTotInvVal() {
	  return TotInvVal;
	 }

	 public float getStCesVal() {
	  return StCesVal;
	 }

	 public float getSgstVal() {
	  return SgstVal;
	 }

	 // Setter Methods

	 public void setCgstVal(float CgstVal) {
	  this.CgstVal = CgstVal;
	 }

	 public void setDiscount(float Discount) {
	  this.Discount = Discount;
	 }

	 public void setAssVal(float AssVal) {
	  this.AssVal = AssVal;
	 }

	 public void setOthChrg(float OthChrg) {
	  this.OthChrg = OthChrg;
	 }

	 public void setIgstVal(float IgstVal) {
	  this.IgstVal = IgstVal;
	 }

	 public void setRndOffAmt(float RndOffAmt) {
	  this.RndOffAmt = RndOffAmt;
	 }

	 public void setCesVal(float CesVal) {
	  this.CesVal = CesVal;
	 }

	 public void setTotInvVal(float TotInvVal) {
	  this.TotInvVal = TotInvVal;
	 }

	 public void setStCesVal(float StCesVal) {
	  this.StCesVal = StCesVal;
	 }

	 public void setSgstVal(float SgstVal) {
	  this.SgstVal = SgstVal;
	 }
	}
}
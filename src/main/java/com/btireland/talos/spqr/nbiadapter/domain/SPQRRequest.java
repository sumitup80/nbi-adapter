package com.btireland.talos.spqr.nbiadapter.domain;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SPQRRequest",
        propOrder = {"version", "order"}
)
public class SPQRRequest {
    @XmlElement(
            name = "VERSION"
    )
    protected double version;
    @XmlElement(
            name = "ORDER",
            required = true
    )
    protected SPQRRequest.ORDER order;

    public SPQRRequest() {
    }

    public double getVERSION() {
        return this.version;
    }

    public void setVERSION(double value) {
        this.version = value;
    }

    public SPQRRequest.ORDER getORDER() {
        return this.order;
    }

    public void setORDER(SPQRRequest.ORDER value) {
        this.order = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"header", "orderdata"}
    )
    public static class ORDER {
        @XmlElement(
                name = "HEADER",
                required = true
        )
        protected SPQRRequest.ORDER.HEADER header;
        @XmlElement(
                name = "ORDER_DATA",
                required = true
        )
        protected SPQRRequest.ORDER.ORDERDATA orderdata;

        public ORDER() {
        }

        public SPQRRequest.ORDER.HEADER getHEADER() {
            return this.header;
        }

        public void setHEADER(SPQRRequest.ORDER.HEADER value) {
            this.header = value;
        }

        public SPQRRequest.ORDER.ORDERDATA getORDERDATA() {
            return this.orderdata;
        }

        public void setORDERDATA(SPQRRequest.ORDER.ORDERDATA value) {
            this.orderdata = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
                name = "",
                propOrder = {"operatordetails", "orderdetails", "targetdetails"}
        )
        public static class ORDERDATA {
            @XmlElement(
                    name = "OPERATOR_DETAILS",
                    required = true
            )
            protected SPQRRequest.ORDER.ORDERDATA.OPERATORDETAILS operatordetails;
            @XmlElement(
                    name = "ORDER_DETAILS",
                    required = true
            )
            protected SPQRRequest.ORDER.ORDERDATA.ORDERDETAILS orderdetails;
            @XmlElement(
                    name = "TARGET_DETAILS",
                    required = true
            )
            protected SPQRRequest.ORDER.ORDERDATA.TARGETDETAILS targetdetails;

            public ORDERDATA() {
            }

            public SPQRRequest.ORDER.ORDERDATA.OPERATORDETAILS getOPERATORDETAILS() {
                return this.operatordetails;
            }

            public void setOPERATORDETAILS(SPQRRequest.ORDER.ORDERDATA.OPERATORDETAILS value) {
                this.operatordetails = value;
            }

            public SPQRRequest.ORDER.ORDERDATA.ORDERDETAILS getORDERDETAILS() {
                return this.orderdetails;
            }

            public void setORDERDETAILS(SPQRRequest.ORDER.ORDERDATA.ORDERDETAILS value) {
                this.orderdetails = value;
            }

            public SPQRRequest.ORDER.ORDERDATA.TARGETDETAILS getTARGETDETAILS() {
                return this.targetdetails;
            }

            public void setTARGETDETAILS(SPQRRequest.ORDER.ORDERDATA.TARGETDETAILS value) {
                this.targetdetails = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                    name = "",
                    propOrder = {"targetidentifier"}
            )
            public static class TARGETDETAILS {
                @XmlElement(
                        name = "TARGET_IDENTIFIER",
                        required = true
                )
                protected SPQRRequest.ORDER.ORDERDATA.TARGETDETAILS.TARGETIDENTIFIER targetidentifier;

                public TARGETDETAILS() {
                }

                public SPQRRequest.ORDER.ORDERDATA.TARGETDETAILS.TARGETIDENTIFIER getTARGETIDENTIFIER() {
                    return this.targetidentifier;
                }

                public void setTARGETIDENTIFIER(SPQRRequest.ORDER.ORDERDATA.TARGETDETAILS.TARGETIDENTIFIER value) {
                    this.targetidentifier = value;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(
                        name = "",
                        propOrder = {"accountnumber", "teleno", "eircode"}
                )
                public static class TARGETIDENTIFIER {
                    @XmlElement(
                            name = "ACCOUNT_NUMBER"
                    )
                    protected String accountnumber;
                    @XmlElement(
                            name = "TELE_NO"
                    )
                    protected String teleno;
                    @XmlElement(
                            name = "EIRCODE"
                    )
                    protected String eircode;

                    public TARGETIDENTIFIER() {
                    }

                    public String getACCOUNTNUMBER() {
                        return this.accountnumber;
                    }

                    public void setACCOUNTNUMBER(String value) {
                        this.accountnumber = value;
                    }

                    public String getTELENO() {
                        return this.teleno;
                    }

                    public void setTELENO(String value) {
                        this.teleno = value;
                    }

                    public String getEIRCODE() {
                        return this.eircode;
                    }

                    public void setEIRCODE(String value) {
                        this.eircode = value;
                    }
                }
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                    name = "",
                    propOrder = {"ordernumber", "type", "applicationdate"}
            )
            public static class ORDERDETAILS {
                @XmlElement(
                        name = "ORDER_NUMBER",
                        required = true
                )
                protected String ordernumber;
                @XmlElement(
                        name = "TYPE",
                        required = true
                )
                protected String type;
                @XmlElement(
                        name = "APPLICATION_DATE",
                        required = true
                )
                protected String applicationdate;

                public ORDERDETAILS() {
                }

                public String getORDERNUMBER() {
                    return this.ordernumber;
                }

                public void setORDERNUMBER(String value) {
                    this.ordernumber = value;
                }

                public String getTYPE() {
                    return this.type;
                }

                public void setTYPE(String value) {
                    this.type = value;
                }

                public String getAPPLICATIONDATE() {
                    return this.applicationdate;
                }

                public void setAPPLICATIONDATE(String value) {
                    this.applicationdate = value;
                }
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                    name = "",
                    propOrder = {"name", "code"}
            )
            public static class OPERATORDETAILS {
                @XmlElement(
                        name = "NAME",
                        required = true
                )
                protected String name;
                @XmlElement(
                        name = "CODE",
                        required = true
                )
                protected String code;

                public OPERATORDETAILS() {
                }

                public String getNAME() {
                    return this.name;
                }

                public void setNAME(String value) {
                    this.name = value;
                }

                public String getCODE() {
                    return this.code;
                }

                public void setCODE(String value) {
                    this.code = value;
                }
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
                name = "",
                propOrder = {"datacontractname", "originatorcode", "transactionid", "datetimestamp"}
        )
        public static class HEADER {
            @XmlElement(
                    name = "DATA_CONTRACT_NAME",
                    required = true
            )
            protected String datacontractname;
            @XmlElement(
                    name = "ORIGINATOR_CODE",
                    required = true
            )
            protected String originatorcode;
            @XmlElement(
                    name = "TRANSACTION_ID"
            )
            protected long transactionid;
            @XmlElement(
                    name = "DATE_TIME_STAMP",
                    required = true
            )
            protected String datetimestamp;

            public HEADER() {
            }

            public String getDATACONTRACTNAME() {
                return this.datacontractname;
            }

            public void setDATACONTRACTNAME(String value) {
                this.datacontractname = value;
            }

            public String getORIGINATORCODE() {
                return this.originatorcode;
            }

            public void setORIGINATORCODE(String value) {
                this.originatorcode = value;
            }

            public long getTRANSACTIONID() {
                return this.transactionid;
            }

            public void setTRANSACTIONID(long value) {
                this.transactionid = value;
            }

            public String getDATETIMESTAMP() {
                return this.datetimestamp;
            }

            public void setDATETIMESTAMP(String value) {
                this.datetimestamp = value;
            }
        }
    }
}

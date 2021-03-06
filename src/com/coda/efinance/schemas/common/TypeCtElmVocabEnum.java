//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:22 AM EST 
//


package com.coda.efinance.schemas.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCtElmVocabEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCtElmVocabEnum"&gt;
 *   &lt;restriction base="{http://www.coda.com/efinance/schemas/common}typeBaseEnum"&gt;
 *     &lt;enumeration value="vocab_statpayint"/&gt;
 *     &lt;enumeration value="date_account_opened"/&gt;
 *     &lt;enumeration value="master_elmstat"/&gt;
 *     &lt;enumeration value="vocab_comments"/&gt;
 *     &lt;enumeration value="elm_group"/&gt;
 *     &lt;enumeration value="vocab_etm_element_name"/&gt;
 *     &lt;enumeration value="vocab_etm_element_short_name"/&gt;
 *     &lt;enumeration value="vocab_etm_start_year_period"/&gt;
 *     &lt;enumeration value="vocab_etm_end_year_period"/&gt;
 *     &lt;enumeration value="vocab_etm_subanalysed"/&gt;
 *     &lt;enumeration value="vocab_etm_element_currency"/&gt;
 *     &lt;enumeration value="vocab_etm_account_summary"/&gt;
 *     &lt;enumeration value="vocab_etm_matchable"/&gt;
 *     &lt;enumeration value="vocab_etm_settlement_account"/&gt;
 *     &lt;enumeration value="vocab_etm_tax_number"/&gt;
 *     &lt;enumeration value="vocab_etm_payment_status"/&gt;
 *     &lt;enumeration value="vocab_etm_enable_payments"/&gt;
 *     &lt;enumeration value="vocab_etm_paper_payment"/&gt;
 *     &lt;enumeration value="vocab_etm_electronic_payment"/&gt;
 *     &lt;enumeration value="vocab_etm_default_media_code"/&gt;
 *     &lt;enumeration value="vocab_etm_address_name"/&gt;
 *     &lt;enumeration value="vocab_etm_address_line_1"/&gt;
 *     &lt;enumeration value="vocab_etm_address_line_2"/&gt;
 *     &lt;enumeration value="vocab_etm_address_line_3"/&gt;
 *     &lt;enumeration value="vocab_etm_address_line_4"/&gt;
 *     &lt;enumeration value="vocab_etm_address_line_5"/&gt;
 *     &lt;enumeration value="vocab_etm_address_line_6"/&gt;
 *     &lt;enumeration value="vocab_etm_post_code"/&gt;
 *     &lt;enumeration value="vocab_etm_telephone"/&gt;
 *     &lt;enumeration value="vocab_etm_fax"/&gt;
 *     &lt;enumeration value="vocab_etm_e_mail"/&gt;
 *     &lt;enumeration value="vocab_etm_country_code"/&gt;
 *     &lt;enumeration value="vocab_etm_language_code"/&gt;
 *     &lt;enumeration value="vocab_etm_account_number"/&gt;
 *     &lt;enumeration value="vocab_etm_account_name"/&gt;
 *     &lt;enumeration value="vocab_etm_sort_code"/&gt;
 *     &lt;enumeration value="vocab_etm_reference"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_name"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_address_1"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_address_2"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_address_3"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_address_4"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_address_5"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_address_6"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_post_code"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_country_code"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_swift"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_intermediary_name"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_intermediary_address_1"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_intermediary_address_2"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_intermediary_address_3"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_intermediary_address_4"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_intermediary_address_5"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_intermediary_address_6"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_intermediary_post_code"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_intermediary_country"/&gt;
 *     &lt;enumeration value="vocab_etm_customer_supplier"/&gt;
 *     &lt;enumeration value="vocab_etm_normal_terms"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_allowed"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_code_1"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_code_2"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_code_3"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_code_4"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_code_5"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_percent_1"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_percent_2"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_percent_3"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_percent_4"/&gt;
 *     &lt;enumeration value="vocab_etm_discount_percent_5"/&gt;
 *     &lt;enumeration value="vocab_etm_tax_method"/&gt;
 *     &lt;enumeration value="vocab_etm_1099"/&gt;
 *     &lt;enumeration value="vocab_etm_federal_tax_id"/&gt;
 *     &lt;enumeration value="vocab_etm_social_security_number"/&gt;
 *     &lt;enumeration value="vocab_etm_2nd_tin"/&gt;
 *     &lt;enumeration value="vocab_etm_1099_master"/&gt;
 *     &lt;enumeration value="vocab_etm_credit_manager"/&gt;
 *     &lt;enumeration value="vocab_etm_credit_rating"/&gt;
 *     &lt;enumeration value="vocab_etm_credit_rating_date"/&gt;
 *     &lt;enumeration value="vocab_etm_credit_reference"/&gt;
 *     &lt;enumeration value="vocab_etm_credit_agency"/&gt;
 *     &lt;enumeration value="vocab_etm_payment_index"/&gt;
 *     &lt;enumeration value="vocab_etm_standard_industry_code"/&gt;
 *     &lt;enumeration value="vocab_etm_indirect_element"/&gt;
 *     &lt;enumeration value="vocab_etm_credit_limit"/&gt;
 *     &lt;enumeration value="vocab_etm_credit_limit_currency"/&gt;
 *     &lt;enumeration value="vocab_etm_credit_limit_date"/&gt;
 *     &lt;enumeration value="vocab_etm_address_category"/&gt;
 *     &lt;enumeration value="vocab_etm_extension_code"/&gt;
 *     &lt;enumeration value="vocab_etm_account_type"/&gt;
 *     &lt;enumeration value="vocab_etm_compulsory_description"/&gt;
 *     &lt;enumeration value="vocab_etm_keep_turnovers"/&gt;
 *     &lt;enumeration value="vocab_etm_asset_related_element"/&gt;
 *     &lt;enumeration value="vocab_etm_element_subs_level"/&gt;
 *     &lt;enumeration value="vocab_etm_element_subs_code"/&gt;
 *     &lt;enumeration value="vocab_etm_extension_master"/&gt;
 *     &lt;enumeration value="vocab_etm_tax_code"/&gt;
 *     &lt;enumeration value="vocab_etm_reconciliation_status"/&gt;
 *     &lt;enumeration value="vocab_etm_user_status"/&gt;
 *     &lt;enumeration value="vocab_etm_summary_level"/&gt;
 *     &lt;enumeration value="vocab_etm_split_level"/&gt;
 *     &lt;enumeration value="vocab_etm_disperse_option"/&gt;
 *     &lt;enumeration value="vocab_etm_permitted_media_list"/&gt;
 *     &lt;enumeration value="vocab_etm_adjust_tax"/&gt;
 *     &lt;enumeration value="vocab_etm_address_list"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_list"/&gt;
 *     &lt;enumeration value="vocab_etm_element_status"/&gt;
 *     &lt;enumeration value="vocab_etm_statutory_acount"/&gt;
 *     &lt;enumeration value="vocab_etm_esl"/&gt;
 *     &lt;enumeration value="vocab_etm_intrastat"/&gt;
 *     &lt;enumeration value="vocab_etm_group_list"/&gt;
 *     &lt;enumeration value="vocab_etm_mnemonics"/&gt;
 *     &lt;enumeration value="vocab_etm_element_comments"/&gt;
 *     &lt;enumeration value="vocab_etm_credit_limit_required"/&gt;
 *     &lt;enumeration value="vocab_etm_archive_when_not_paid"/&gt;
 *     &lt;enumeration value="vocab_etm_archive_when_not_reconciled"/&gt;
 *     &lt;enumeration value="vocab_etm_allow_proc_transmit_pdf"/&gt;
 *     &lt;enumeration value="vocab_etm_allow_proc_transmit_xml"/&gt;
 *     &lt;enumeration value="vocab_etm_allow_proc_transmit_b2b"/&gt;
 *     &lt;enumeration value="vocab_etm_allow_procurement_printing"/&gt;
 *     &lt;enumeration value="vocab_etm_default_orders_format"/&gt;
 *     &lt;enumeration value="vocab_etm_default_requisitions_format"/&gt;
 *     &lt;enumeration value="vocab_etm_allow_billing_transmit_pdf"/&gt;
 *     &lt;enumeration value="vocab_etm_allow_billing_transmit_xml"/&gt;
 *     &lt;enumeration value="vocab_etm_allow_billing_printing"/&gt;
 *     &lt;enumeration value="vocab_etm_default_proforma_invoices_format"/&gt;
 *     &lt;enumeration value="vocab_etm_default_final_invoices_format"/&gt;
 *     &lt;enumeration value="vocab_etm_default_proforma_creditnote_format"/&gt;
 *     &lt;enumeration value="vocab_etm_default_final_creditnote_format"/&gt;
 *     &lt;enumeration value="vocab_etm_default_category"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity1_used"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity2_used"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity3_used"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity4_used"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity1_title"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity2_title"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity3_title"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity4_title"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity1_mandatory"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity2_mandatory"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity3_mandatory"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity4_mandatory"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity1_balcode"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity2_balcode"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity3_balcode"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity4_balcode"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity1_decimals"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity2_decimals"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity3_decimals"/&gt;
 *     &lt;enumeration value="vocab_etm_quantity4_decimals"/&gt;
 *     &lt;enumeration value="vocab_etm_left_list"/&gt;
 *     &lt;enumeration value="vocab_etm_right_list"/&gt;
 *     &lt;enumeration value="vocab_etm_date_acc_opened"/&gt;
 *     &lt;enumeration value="vocab_etm_balancing_account"/&gt;
 *     &lt;enumeration value="vocab_etm_reporting_code_1"/&gt;
 *     &lt;enumeration value="vocab_etm_reporting_code_2"/&gt;
 *     &lt;enumeration value="vocab_etm_reporting_code_3"/&gt;
 *     &lt;enumeration value="vocab_etm_ssb_self_billable"/&gt;
 *     &lt;enumeration value="vocab_etm_purch_invoice_doc"/&gt;
 *     &lt;enumeration value="vocab_etm_grn_summ_rule"/&gt;
 *     &lt;enumeration value="vocab_etm_def_print_format"/&gt;
 *     &lt;enumeration value="vocab_etm_is_customer"/&gt;
 *     &lt;enumeration value="vocab_etm_is_supplier"/&gt;
 *     &lt;enumeration value="vocab_etm_calculate_due_date"/&gt;
 *     &lt;enumeration value="vocab_etm_auto_receipt"/&gt;
 *     &lt;enumeration value="vocab_etm_proc_status"/&gt;
 *     &lt;enumeration value="vocab_etm_bank_iban"/&gt;
 *     &lt;enumeration value="vocab_etm_retail_code"/&gt;
 *     &lt;enumeration value="vocab_etm_days_open"/&gt;
 *     &lt;enumeration value="vocab_etm_first_trading_date"/&gt;
 *     &lt;enumeration value="vocab_etm_last_trading_date"/&gt;
 *     &lt;enumeration value="vocab_etm_retail_tax_group"/&gt;
 *     &lt;enumeration value="vocab_etm_sales_category"/&gt;
 *     &lt;enumeration value="vocab_etm_temporary_closures"/&gt;
 *     &lt;enumeration value="vocab_etm_user_defined_fields"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCtElmVocabEnum")
@XmlEnum
public enum TypeCtElmVocabEnum {

    @XmlEnumValue("vocab_statpayint")
    VOCAB_STATPAYINT("vocab_statpayint"),
    @XmlEnumValue("date_account_opened")
    DATE_ACCOUNT_OPENED("date_account_opened"),
    @XmlEnumValue("master_elmstat")
    MASTER_ELMSTAT("master_elmstat"),
    @XmlEnumValue("vocab_comments")
    VOCAB_COMMENTS("vocab_comments"),
    @XmlEnumValue("elm_group")
    ELM_GROUP("elm_group"),
    @XmlEnumValue("vocab_etm_element_name")
    VOCAB_ETM_ELEMENT_NAME("vocab_etm_element_name"),
    @XmlEnumValue("vocab_etm_element_short_name")
    VOCAB_ETM_ELEMENT_SHORT_NAME("vocab_etm_element_short_name"),
    @XmlEnumValue("vocab_etm_start_year_period")
    VOCAB_ETM_START_YEAR_PERIOD("vocab_etm_start_year_period"),
    @XmlEnumValue("vocab_etm_end_year_period")
    VOCAB_ETM_END_YEAR_PERIOD("vocab_etm_end_year_period"),
    @XmlEnumValue("vocab_etm_subanalysed")
    VOCAB_ETM_SUBANALYSED("vocab_etm_subanalysed"),
    @XmlEnumValue("vocab_etm_element_currency")
    VOCAB_ETM_ELEMENT_CURRENCY("vocab_etm_element_currency"),
    @XmlEnumValue("vocab_etm_account_summary")
    VOCAB_ETM_ACCOUNT_SUMMARY("vocab_etm_account_summary"),
    @XmlEnumValue("vocab_etm_matchable")
    VOCAB_ETM_MATCHABLE("vocab_etm_matchable"),
    @XmlEnumValue("vocab_etm_settlement_account")
    VOCAB_ETM_SETTLEMENT_ACCOUNT("vocab_etm_settlement_account"),
    @XmlEnumValue("vocab_etm_tax_number")
    VOCAB_ETM_TAX_NUMBER("vocab_etm_tax_number"),
    @XmlEnumValue("vocab_etm_payment_status")
    VOCAB_ETM_PAYMENT_STATUS("vocab_etm_payment_status"),
    @XmlEnumValue("vocab_etm_enable_payments")
    VOCAB_ETM_ENABLE_PAYMENTS("vocab_etm_enable_payments"),
    @XmlEnumValue("vocab_etm_paper_payment")
    VOCAB_ETM_PAPER_PAYMENT("vocab_etm_paper_payment"),
    @XmlEnumValue("vocab_etm_electronic_payment")
    VOCAB_ETM_ELECTRONIC_PAYMENT("vocab_etm_electronic_payment"),
    @XmlEnumValue("vocab_etm_default_media_code")
    VOCAB_ETM_DEFAULT_MEDIA_CODE("vocab_etm_default_media_code"),
    @XmlEnumValue("vocab_etm_address_name")
    VOCAB_ETM_ADDRESS_NAME("vocab_etm_address_name"),
    @XmlEnumValue("vocab_etm_address_line_1")
    VOCAB_ETM_ADDRESS_LINE_1("vocab_etm_address_line_1"),
    @XmlEnumValue("vocab_etm_address_line_2")
    VOCAB_ETM_ADDRESS_LINE_2("vocab_etm_address_line_2"),
    @XmlEnumValue("vocab_etm_address_line_3")
    VOCAB_ETM_ADDRESS_LINE_3("vocab_etm_address_line_3"),
    @XmlEnumValue("vocab_etm_address_line_4")
    VOCAB_ETM_ADDRESS_LINE_4("vocab_etm_address_line_4"),
    @XmlEnumValue("vocab_etm_address_line_5")
    VOCAB_ETM_ADDRESS_LINE_5("vocab_etm_address_line_5"),
    @XmlEnumValue("vocab_etm_address_line_6")
    VOCAB_ETM_ADDRESS_LINE_6("vocab_etm_address_line_6"),
    @XmlEnumValue("vocab_etm_post_code")
    VOCAB_ETM_POST_CODE("vocab_etm_post_code"),
    @XmlEnumValue("vocab_etm_telephone")
    VOCAB_ETM_TELEPHONE("vocab_etm_telephone"),
    @XmlEnumValue("vocab_etm_fax")
    VOCAB_ETM_FAX("vocab_etm_fax"),
    @XmlEnumValue("vocab_etm_e_mail")
    VOCAB_ETM_E_MAIL("vocab_etm_e_mail"),
    @XmlEnumValue("vocab_etm_country_code")
    VOCAB_ETM_COUNTRY_CODE("vocab_etm_country_code"),
    @XmlEnumValue("vocab_etm_language_code")
    VOCAB_ETM_LANGUAGE_CODE("vocab_etm_language_code"),
    @XmlEnumValue("vocab_etm_account_number")
    VOCAB_ETM_ACCOUNT_NUMBER("vocab_etm_account_number"),
    @XmlEnumValue("vocab_etm_account_name")
    VOCAB_ETM_ACCOUNT_NAME("vocab_etm_account_name"),
    @XmlEnumValue("vocab_etm_sort_code")
    VOCAB_ETM_SORT_CODE("vocab_etm_sort_code"),
    @XmlEnumValue("vocab_etm_reference")
    VOCAB_ETM_REFERENCE("vocab_etm_reference"),
    @XmlEnumValue("vocab_etm_bank_name")
    VOCAB_ETM_BANK_NAME("vocab_etm_bank_name"),
    @XmlEnumValue("vocab_etm_bank_address_1")
    VOCAB_ETM_BANK_ADDRESS_1("vocab_etm_bank_address_1"),
    @XmlEnumValue("vocab_etm_bank_address_2")
    VOCAB_ETM_BANK_ADDRESS_2("vocab_etm_bank_address_2"),
    @XmlEnumValue("vocab_etm_bank_address_3")
    VOCAB_ETM_BANK_ADDRESS_3("vocab_etm_bank_address_3"),
    @XmlEnumValue("vocab_etm_bank_address_4")
    VOCAB_ETM_BANK_ADDRESS_4("vocab_etm_bank_address_4"),
    @XmlEnumValue("vocab_etm_bank_address_5")
    VOCAB_ETM_BANK_ADDRESS_5("vocab_etm_bank_address_5"),
    @XmlEnumValue("vocab_etm_bank_address_6")
    VOCAB_ETM_BANK_ADDRESS_6("vocab_etm_bank_address_6"),
    @XmlEnumValue("vocab_etm_bank_post_code")
    VOCAB_ETM_BANK_POST_CODE("vocab_etm_bank_post_code"),
    @XmlEnumValue("vocab_etm_bank_country_code")
    VOCAB_ETM_BANK_COUNTRY_CODE("vocab_etm_bank_country_code"),
    @XmlEnumValue("vocab_etm_bank_swift")
    VOCAB_ETM_BANK_SWIFT("vocab_etm_bank_swift"),
    @XmlEnumValue("vocab_etm_bank_intermediary_name")
    VOCAB_ETM_BANK_INTERMEDIARY_NAME("vocab_etm_bank_intermediary_name"),
    @XmlEnumValue("vocab_etm_bank_intermediary_address_1")
    VOCAB_ETM_BANK_INTERMEDIARY_ADDRESS_1("vocab_etm_bank_intermediary_address_1"),
    @XmlEnumValue("vocab_etm_bank_intermediary_address_2")
    VOCAB_ETM_BANK_INTERMEDIARY_ADDRESS_2("vocab_etm_bank_intermediary_address_2"),
    @XmlEnumValue("vocab_etm_bank_intermediary_address_3")
    VOCAB_ETM_BANK_INTERMEDIARY_ADDRESS_3("vocab_etm_bank_intermediary_address_3"),
    @XmlEnumValue("vocab_etm_bank_intermediary_address_4")
    VOCAB_ETM_BANK_INTERMEDIARY_ADDRESS_4("vocab_etm_bank_intermediary_address_4"),
    @XmlEnumValue("vocab_etm_bank_intermediary_address_5")
    VOCAB_ETM_BANK_INTERMEDIARY_ADDRESS_5("vocab_etm_bank_intermediary_address_5"),
    @XmlEnumValue("vocab_etm_bank_intermediary_address_6")
    VOCAB_ETM_BANK_INTERMEDIARY_ADDRESS_6("vocab_etm_bank_intermediary_address_6"),
    @XmlEnumValue("vocab_etm_bank_intermediary_post_code")
    VOCAB_ETM_BANK_INTERMEDIARY_POST_CODE("vocab_etm_bank_intermediary_post_code"),
    @XmlEnumValue("vocab_etm_bank_intermediary_country")
    VOCAB_ETM_BANK_INTERMEDIARY_COUNTRY("vocab_etm_bank_intermediary_country"),
    @XmlEnumValue("vocab_etm_customer_supplier")
    VOCAB_ETM_CUSTOMER_SUPPLIER("vocab_etm_customer_supplier"),
    @XmlEnumValue("vocab_etm_normal_terms")
    VOCAB_ETM_NORMAL_TERMS("vocab_etm_normal_terms"),
    @XmlEnumValue("vocab_etm_discount_allowed")
    VOCAB_ETM_DISCOUNT_ALLOWED("vocab_etm_discount_allowed"),
    @XmlEnumValue("vocab_etm_discount_code_1")
    VOCAB_ETM_DISCOUNT_CODE_1("vocab_etm_discount_code_1"),
    @XmlEnumValue("vocab_etm_discount_code_2")
    VOCAB_ETM_DISCOUNT_CODE_2("vocab_etm_discount_code_2"),
    @XmlEnumValue("vocab_etm_discount_code_3")
    VOCAB_ETM_DISCOUNT_CODE_3("vocab_etm_discount_code_3"),
    @XmlEnumValue("vocab_etm_discount_code_4")
    VOCAB_ETM_DISCOUNT_CODE_4("vocab_etm_discount_code_4"),
    @XmlEnumValue("vocab_etm_discount_code_5")
    VOCAB_ETM_DISCOUNT_CODE_5("vocab_etm_discount_code_5"),
    @XmlEnumValue("vocab_etm_discount_percent_1")
    VOCAB_ETM_DISCOUNT_PERCENT_1("vocab_etm_discount_percent_1"),
    @XmlEnumValue("vocab_etm_discount_percent_2")
    VOCAB_ETM_DISCOUNT_PERCENT_2("vocab_etm_discount_percent_2"),
    @XmlEnumValue("vocab_etm_discount_percent_3")
    VOCAB_ETM_DISCOUNT_PERCENT_3("vocab_etm_discount_percent_3"),
    @XmlEnumValue("vocab_etm_discount_percent_4")
    VOCAB_ETM_DISCOUNT_PERCENT_4("vocab_etm_discount_percent_4"),
    @XmlEnumValue("vocab_etm_discount_percent_5")
    VOCAB_ETM_DISCOUNT_PERCENT_5("vocab_etm_discount_percent_5"),
    @XmlEnumValue("vocab_etm_tax_method")
    VOCAB_ETM_TAX_METHOD("vocab_etm_tax_method"),
    @XmlEnumValue("vocab_etm_1099")
    VOCAB_ETM_1099("vocab_etm_1099"),
    @XmlEnumValue("vocab_etm_federal_tax_id")
    VOCAB_ETM_FEDERAL_TAX_ID("vocab_etm_federal_tax_id"),
    @XmlEnumValue("vocab_etm_social_security_number")
    VOCAB_ETM_SOCIAL_SECURITY_NUMBER("vocab_etm_social_security_number"),
    @XmlEnumValue("vocab_etm_2nd_tin")
    VOCAB_ETM_2_ND_TIN("vocab_etm_2nd_tin"),
    @XmlEnumValue("vocab_etm_1099_master")
    VOCAB_ETM_1099_MASTER("vocab_etm_1099_master"),
    @XmlEnumValue("vocab_etm_credit_manager")
    VOCAB_ETM_CREDIT_MANAGER("vocab_etm_credit_manager"),
    @XmlEnumValue("vocab_etm_credit_rating")
    VOCAB_ETM_CREDIT_RATING("vocab_etm_credit_rating"),
    @XmlEnumValue("vocab_etm_credit_rating_date")
    VOCAB_ETM_CREDIT_RATING_DATE("vocab_etm_credit_rating_date"),
    @XmlEnumValue("vocab_etm_credit_reference")
    VOCAB_ETM_CREDIT_REFERENCE("vocab_etm_credit_reference"),
    @XmlEnumValue("vocab_etm_credit_agency")
    VOCAB_ETM_CREDIT_AGENCY("vocab_etm_credit_agency"),
    @XmlEnumValue("vocab_etm_payment_index")
    VOCAB_ETM_PAYMENT_INDEX("vocab_etm_payment_index"),
    @XmlEnumValue("vocab_etm_standard_industry_code")
    VOCAB_ETM_STANDARD_INDUSTRY_CODE("vocab_etm_standard_industry_code"),
    @XmlEnumValue("vocab_etm_indirect_element")
    VOCAB_ETM_INDIRECT_ELEMENT("vocab_etm_indirect_element"),
    @XmlEnumValue("vocab_etm_credit_limit")
    VOCAB_ETM_CREDIT_LIMIT("vocab_etm_credit_limit"),
    @XmlEnumValue("vocab_etm_credit_limit_currency")
    VOCAB_ETM_CREDIT_LIMIT_CURRENCY("vocab_etm_credit_limit_currency"),
    @XmlEnumValue("vocab_etm_credit_limit_date")
    VOCAB_ETM_CREDIT_LIMIT_DATE("vocab_etm_credit_limit_date"),
    @XmlEnumValue("vocab_etm_address_category")
    VOCAB_ETM_ADDRESS_CATEGORY("vocab_etm_address_category"),
    @XmlEnumValue("vocab_etm_extension_code")
    VOCAB_ETM_EXTENSION_CODE("vocab_etm_extension_code"),
    @XmlEnumValue("vocab_etm_account_type")
    VOCAB_ETM_ACCOUNT_TYPE("vocab_etm_account_type"),
    @XmlEnumValue("vocab_etm_compulsory_description")
    VOCAB_ETM_COMPULSORY_DESCRIPTION("vocab_etm_compulsory_description"),
    @XmlEnumValue("vocab_etm_keep_turnovers")
    VOCAB_ETM_KEEP_TURNOVERS("vocab_etm_keep_turnovers"),
    @XmlEnumValue("vocab_etm_asset_related_element")
    VOCAB_ETM_ASSET_RELATED_ELEMENT("vocab_etm_asset_related_element"),
    @XmlEnumValue("vocab_etm_element_subs_level")
    VOCAB_ETM_ELEMENT_SUBS_LEVEL("vocab_etm_element_subs_level"),
    @XmlEnumValue("vocab_etm_element_subs_code")
    VOCAB_ETM_ELEMENT_SUBS_CODE("vocab_etm_element_subs_code"),
    @XmlEnumValue("vocab_etm_extension_master")
    VOCAB_ETM_EXTENSION_MASTER("vocab_etm_extension_master"),
    @XmlEnumValue("vocab_etm_tax_code")
    VOCAB_ETM_TAX_CODE("vocab_etm_tax_code"),
    @XmlEnumValue("vocab_etm_reconciliation_status")
    VOCAB_ETM_RECONCILIATION_STATUS("vocab_etm_reconciliation_status"),
    @XmlEnumValue("vocab_etm_user_status")
    VOCAB_ETM_USER_STATUS("vocab_etm_user_status"),
    @XmlEnumValue("vocab_etm_summary_level")
    VOCAB_ETM_SUMMARY_LEVEL("vocab_etm_summary_level"),
    @XmlEnumValue("vocab_etm_split_level")
    VOCAB_ETM_SPLIT_LEVEL("vocab_etm_split_level"),
    @XmlEnumValue("vocab_etm_disperse_option")
    VOCAB_ETM_DISPERSE_OPTION("vocab_etm_disperse_option"),
    @XmlEnumValue("vocab_etm_permitted_media_list")
    VOCAB_ETM_PERMITTED_MEDIA_LIST("vocab_etm_permitted_media_list"),
    @XmlEnumValue("vocab_etm_adjust_tax")
    VOCAB_ETM_ADJUST_TAX("vocab_etm_adjust_tax"),
    @XmlEnumValue("vocab_etm_address_list")
    VOCAB_ETM_ADDRESS_LIST("vocab_etm_address_list"),
    @XmlEnumValue("vocab_etm_bank_list")
    VOCAB_ETM_BANK_LIST("vocab_etm_bank_list"),
    @XmlEnumValue("vocab_etm_element_status")
    VOCAB_ETM_ELEMENT_STATUS("vocab_etm_element_status"),
    @XmlEnumValue("vocab_etm_statutory_acount")
    VOCAB_ETM_STATUTORY_ACOUNT("vocab_etm_statutory_acount"),
    @XmlEnumValue("vocab_etm_esl")
    VOCAB_ETM_ESL("vocab_etm_esl"),
    @XmlEnumValue("vocab_etm_intrastat")
    VOCAB_ETM_INTRASTAT("vocab_etm_intrastat"),
    @XmlEnumValue("vocab_etm_group_list")
    VOCAB_ETM_GROUP_LIST("vocab_etm_group_list"),
    @XmlEnumValue("vocab_etm_mnemonics")
    VOCAB_ETM_MNEMONICS("vocab_etm_mnemonics"),
    @XmlEnumValue("vocab_etm_element_comments")
    VOCAB_ETM_ELEMENT_COMMENTS("vocab_etm_element_comments"),
    @XmlEnumValue("vocab_etm_credit_limit_required")
    VOCAB_ETM_CREDIT_LIMIT_REQUIRED("vocab_etm_credit_limit_required"),
    @XmlEnumValue("vocab_etm_archive_when_not_paid")
    VOCAB_ETM_ARCHIVE_WHEN_NOT_PAID("vocab_etm_archive_when_not_paid"),
    @XmlEnumValue("vocab_etm_archive_when_not_reconciled")
    VOCAB_ETM_ARCHIVE_WHEN_NOT_RECONCILED("vocab_etm_archive_when_not_reconciled"),
    @XmlEnumValue("vocab_etm_allow_proc_transmit_pdf")
    VOCAB_ETM_ALLOW_PROC_TRANSMIT_PDF("vocab_etm_allow_proc_transmit_pdf"),
    @XmlEnumValue("vocab_etm_allow_proc_transmit_xml")
    VOCAB_ETM_ALLOW_PROC_TRANSMIT_XML("vocab_etm_allow_proc_transmit_xml"),
    @XmlEnumValue("vocab_etm_allow_proc_transmit_b2b")
    VOCAB_ETM_ALLOW_PROC_TRANSMIT_B_2_B("vocab_etm_allow_proc_transmit_b2b"),
    @XmlEnumValue("vocab_etm_allow_procurement_printing")
    VOCAB_ETM_ALLOW_PROCUREMENT_PRINTING("vocab_etm_allow_procurement_printing"),
    @XmlEnumValue("vocab_etm_default_orders_format")
    VOCAB_ETM_DEFAULT_ORDERS_FORMAT("vocab_etm_default_orders_format"),
    @XmlEnumValue("vocab_etm_default_requisitions_format")
    VOCAB_ETM_DEFAULT_REQUISITIONS_FORMAT("vocab_etm_default_requisitions_format"),
    @XmlEnumValue("vocab_etm_allow_billing_transmit_pdf")
    VOCAB_ETM_ALLOW_BILLING_TRANSMIT_PDF("vocab_etm_allow_billing_transmit_pdf"),
    @XmlEnumValue("vocab_etm_allow_billing_transmit_xml")
    VOCAB_ETM_ALLOW_BILLING_TRANSMIT_XML("vocab_etm_allow_billing_transmit_xml"),
    @XmlEnumValue("vocab_etm_allow_billing_printing")
    VOCAB_ETM_ALLOW_BILLING_PRINTING("vocab_etm_allow_billing_printing"),
    @XmlEnumValue("vocab_etm_default_proforma_invoices_format")
    VOCAB_ETM_DEFAULT_PROFORMA_INVOICES_FORMAT("vocab_etm_default_proforma_invoices_format"),
    @XmlEnumValue("vocab_etm_default_final_invoices_format")
    VOCAB_ETM_DEFAULT_FINAL_INVOICES_FORMAT("vocab_etm_default_final_invoices_format"),
    @XmlEnumValue("vocab_etm_default_proforma_creditnote_format")
    VOCAB_ETM_DEFAULT_PROFORMA_CREDITNOTE_FORMAT("vocab_etm_default_proforma_creditnote_format"),
    @XmlEnumValue("vocab_etm_default_final_creditnote_format")
    VOCAB_ETM_DEFAULT_FINAL_CREDITNOTE_FORMAT("vocab_etm_default_final_creditnote_format"),
    @XmlEnumValue("vocab_etm_default_category")
    VOCAB_ETM_DEFAULT_CATEGORY("vocab_etm_default_category"),
    @XmlEnumValue("vocab_etm_quantity1_used")
    VOCAB_ETM_QUANTITY_1_USED("vocab_etm_quantity1_used"),
    @XmlEnumValue("vocab_etm_quantity2_used")
    VOCAB_ETM_QUANTITY_2_USED("vocab_etm_quantity2_used"),
    @XmlEnumValue("vocab_etm_quantity3_used")
    VOCAB_ETM_QUANTITY_3_USED("vocab_etm_quantity3_used"),
    @XmlEnumValue("vocab_etm_quantity4_used")
    VOCAB_ETM_QUANTITY_4_USED("vocab_etm_quantity4_used"),
    @XmlEnumValue("vocab_etm_quantity1_title")
    VOCAB_ETM_QUANTITY_1_TITLE("vocab_etm_quantity1_title"),
    @XmlEnumValue("vocab_etm_quantity2_title")
    VOCAB_ETM_QUANTITY_2_TITLE("vocab_etm_quantity2_title"),
    @XmlEnumValue("vocab_etm_quantity3_title")
    VOCAB_ETM_QUANTITY_3_TITLE("vocab_etm_quantity3_title"),
    @XmlEnumValue("vocab_etm_quantity4_title")
    VOCAB_ETM_QUANTITY_4_TITLE("vocab_etm_quantity4_title"),
    @XmlEnumValue("vocab_etm_quantity1_mandatory")
    VOCAB_ETM_QUANTITY_1_MANDATORY("vocab_etm_quantity1_mandatory"),
    @XmlEnumValue("vocab_etm_quantity2_mandatory")
    VOCAB_ETM_QUANTITY_2_MANDATORY("vocab_etm_quantity2_mandatory"),
    @XmlEnumValue("vocab_etm_quantity3_mandatory")
    VOCAB_ETM_QUANTITY_3_MANDATORY("vocab_etm_quantity3_mandatory"),
    @XmlEnumValue("vocab_etm_quantity4_mandatory")
    VOCAB_ETM_QUANTITY_4_MANDATORY("vocab_etm_quantity4_mandatory"),
    @XmlEnumValue("vocab_etm_quantity1_balcode")
    VOCAB_ETM_QUANTITY_1_BALCODE("vocab_etm_quantity1_balcode"),
    @XmlEnumValue("vocab_etm_quantity2_balcode")
    VOCAB_ETM_QUANTITY_2_BALCODE("vocab_etm_quantity2_balcode"),
    @XmlEnumValue("vocab_etm_quantity3_balcode")
    VOCAB_ETM_QUANTITY_3_BALCODE("vocab_etm_quantity3_balcode"),
    @XmlEnumValue("vocab_etm_quantity4_balcode")
    VOCAB_ETM_QUANTITY_4_BALCODE("vocab_etm_quantity4_balcode"),
    @XmlEnumValue("vocab_etm_quantity1_decimals")
    VOCAB_ETM_QUANTITY_1_DECIMALS("vocab_etm_quantity1_decimals"),
    @XmlEnumValue("vocab_etm_quantity2_decimals")
    VOCAB_ETM_QUANTITY_2_DECIMALS("vocab_etm_quantity2_decimals"),
    @XmlEnumValue("vocab_etm_quantity3_decimals")
    VOCAB_ETM_QUANTITY_3_DECIMALS("vocab_etm_quantity3_decimals"),
    @XmlEnumValue("vocab_etm_quantity4_decimals")
    VOCAB_ETM_QUANTITY_4_DECIMALS("vocab_etm_quantity4_decimals"),
    @XmlEnumValue("vocab_etm_left_list")
    VOCAB_ETM_LEFT_LIST("vocab_etm_left_list"),
    @XmlEnumValue("vocab_etm_right_list")
    VOCAB_ETM_RIGHT_LIST("vocab_etm_right_list"),
    @XmlEnumValue("vocab_etm_date_acc_opened")
    VOCAB_ETM_DATE_ACC_OPENED("vocab_etm_date_acc_opened"),
    @XmlEnumValue("vocab_etm_balancing_account")
    VOCAB_ETM_BALANCING_ACCOUNT("vocab_etm_balancing_account"),
    @XmlEnumValue("vocab_etm_reporting_code_1")
    VOCAB_ETM_REPORTING_CODE_1("vocab_etm_reporting_code_1"),
    @XmlEnumValue("vocab_etm_reporting_code_2")
    VOCAB_ETM_REPORTING_CODE_2("vocab_etm_reporting_code_2"),
    @XmlEnumValue("vocab_etm_reporting_code_3")
    VOCAB_ETM_REPORTING_CODE_3("vocab_etm_reporting_code_3"),
    @XmlEnumValue("vocab_etm_ssb_self_billable")
    VOCAB_ETM_SSB_SELF_BILLABLE("vocab_etm_ssb_self_billable"),
    @XmlEnumValue("vocab_etm_purch_invoice_doc")
    VOCAB_ETM_PURCH_INVOICE_DOC("vocab_etm_purch_invoice_doc"),
    @XmlEnumValue("vocab_etm_grn_summ_rule")
    VOCAB_ETM_GRN_SUMM_RULE("vocab_etm_grn_summ_rule"),
    @XmlEnumValue("vocab_etm_def_print_format")
    VOCAB_ETM_DEF_PRINT_FORMAT("vocab_etm_def_print_format"),
    @XmlEnumValue("vocab_etm_is_customer")
    VOCAB_ETM_IS_CUSTOMER("vocab_etm_is_customer"),
    @XmlEnumValue("vocab_etm_is_supplier")
    VOCAB_ETM_IS_SUPPLIER("vocab_etm_is_supplier"),
    @XmlEnumValue("vocab_etm_calculate_due_date")
    VOCAB_ETM_CALCULATE_DUE_DATE("vocab_etm_calculate_due_date"),
    @XmlEnumValue("vocab_etm_auto_receipt")
    VOCAB_ETM_AUTO_RECEIPT("vocab_etm_auto_receipt"),
    @XmlEnumValue("vocab_etm_proc_status")
    VOCAB_ETM_PROC_STATUS("vocab_etm_proc_status"),
    @XmlEnumValue("vocab_etm_bank_iban")
    VOCAB_ETM_BANK_IBAN("vocab_etm_bank_iban"),
    @XmlEnumValue("vocab_etm_retail_code")
    VOCAB_ETM_RETAIL_CODE("vocab_etm_retail_code"),
    @XmlEnumValue("vocab_etm_days_open")
    VOCAB_ETM_DAYS_OPEN("vocab_etm_days_open"),
    @XmlEnumValue("vocab_etm_first_trading_date")
    VOCAB_ETM_FIRST_TRADING_DATE("vocab_etm_first_trading_date"),
    @XmlEnumValue("vocab_etm_last_trading_date")
    VOCAB_ETM_LAST_TRADING_DATE("vocab_etm_last_trading_date"),
    @XmlEnumValue("vocab_etm_retail_tax_group")
    VOCAB_ETM_RETAIL_TAX_GROUP("vocab_etm_retail_tax_group"),
    @XmlEnumValue("vocab_etm_sales_category")
    VOCAB_ETM_SALES_CATEGORY("vocab_etm_sales_category"),
    @XmlEnumValue("vocab_etm_temporary_closures")
    VOCAB_ETM_TEMPORARY_CLOSURES("vocab_etm_temporary_closures"),
    @XmlEnumValue("vocab_etm_user_defined_fields")
    VOCAB_ETM_USER_DEFINED_FIELDS("vocab_etm_user_defined_fields");
    private final String value;

    TypeCtElmVocabEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCtElmVocabEnum fromValue(String v) {
        for (TypeCtElmVocabEnum c: TypeCtElmVocabEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

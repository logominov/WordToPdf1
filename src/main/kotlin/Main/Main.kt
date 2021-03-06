package Main

import services.DocxService
import services.DocxConverterService
import java.util.*

fun main() {

//    val docxService = DocxService()
    val docxConverterService = DocxConverterService()
//    val date = Date().toString()
//    val quantityToken = 0
//    val fullname = "Ivanov Ivan"
//    val asset = Asset()
//    val docName = "test"
//
//
//    val generatedDocument = docxService.generateTemplate(
//        mapOf(
//            "Dateofpurchase" to date,
//            "NbofShares" to quantityToken.toString(),
//            "Nameoftheinvestor" to fullname,
//            "NameoftheAssetManager" to asset.managerHolder,
//            "Nameoftheasset" to asset.assetProperties.assetName,
//            "Company" to asset.sharingProperty.company
//        ),
//        mapOf(
//            "Nameoftheinvestor" to fullname,
//            "Dateofpurchase" to date,
//            "Company" to asset.sharingProperty.company,
//            "NameoftheAssetManager" to asset.managerHolder
//        ),
//        "SPA Template-converted.docx",
//        docName
//    )
    docxConverterService.convertToPDF("D:\\Users\\Viktor VoC\\WordToPdf\\WordToPdf1\\build\\resources\\main\\tempDirectory\\test.docx", "D:\\Users\\Viktor VoC\\WordToPdf\\WordToPdf1\\build\\resources\\main\\tempDirectory\\test.pdf")
}

data class Asset(
    val managerHolder: String = "SomeManageHolder",
    val assetProperties: AssetProperties = AssetProperties(),
    val sharingProperty: SharingProperty = SharingProperty()
)

data class AssetProperties(val assetName: String = "SomeAssetName")

data class SharingProperty(val company: String = "SomeCompany")

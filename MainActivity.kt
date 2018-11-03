package com.example.crackaddictedunicorn88.exceedrefact

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.crackaddictedunicorn88.exceedrefact.R.id.btc_invisible_address
import com.example.crackaddictedunicorn88.exceedrefact.R.id.eth_invisible_address
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.qr_exc_popup_fragment.*
import org.ethereum.geth.Geth
import org.ethereum.geth.NodeConfig


open class MainActivity : AppCompatActivity() {
    private var myClipboard: ClipboardManager? = null
    private var myClip: ClipData? = null
    var ethAddress24 = GethNodeHolder.getInstance().account.address.hex.toString()
    var btcAddress = "0x0000"


    val manager = supportFragmentManager


    //Fragment Management Methods and Fragment Creation

    fun createStartQRFragment() {
        val transaction = manager.beginTransaction()
        val fragment = qrAddressesFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


    fun createexchangeFragment() {
        val transaction = manager.beginTransaction()
        val fragment = exchangeFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createQrBitcoinPopupFragment() {
        val transaction = manager.beginTransaction()
        val fragment = qrBitcoinPopupFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createQrEthPopupFragment() {
        val transaction = manager.beginTransaction()
        val fragment = qrEthPopupFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createQrExcPopupFragment() {
        val transaction = manager.beginTransaction()
        val fragment = qrExceedPopupFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


    fun createSettingsFragment() {
        val transaction = manager.beginTransaction()
        val fragment = settingsFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun creategenPrefFragment0() {
        val transaction = manager.beginTransaction()
        val fragment = genPrefFragment0()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createrecovery_backup_1_fragment() {
        val transaction = manager.beginTransaction()
        val fragment = recoveryBackup1Fragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createprefNotificationFragment() {
        val transaction = manager.beginTransaction()
        val fragment = prefNotificationFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createWalletFragment() {
        val transaction = manager.beginTransaction()
        val fragment = user_wallet_fragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createHelpFragment() {
        val transaction = manager.beginTransaction()
        val fragment = helpFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createTxnHistoryFragment() {
        val transaction = manager.beginTransaction()
        val fragment = txHistoryFragment()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


    // Send Fragments

    fun createSendExcFragment() {
        val transaction = manager.beginTransaction()
        val fragment = sendExcFragment0()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createConfirmExcFragment(bundle: Bundle) {
        val transaction = manager.beginTransaction()
        val fragment = confirmSendExcFragment()
        fragment.arguments = bundle
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


    fun createSendBtcFragment() {
        val transaction = manager.beginTransaction()
        val fragment = sendBtcFragment0()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createConfirmBtcFragment(bundle: Bundle) {
        val transaction = manager.beginTransaction()
        val fragment = confirmSendBtcFragment()
        fragment.arguments = bundle
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createSendEthFragment() {
        val transaction = manager.beginTransaction()
        val fragment = sendEthFragment0()
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }

    fun createConfirmEthFragment(bundle: Bundle) {
        val transaction = manager.beginTransaction()
        val fragment = confirmSendEthFragment()
        fragment.arguments = bundle
        transaction.replace(R.id.fragmentholder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun openForkUSDT() {
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun openForkETH() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun openForkBTC() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun openTJUSDT() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun openTJETH() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun openTJBTC() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun open0XUSDT() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun open0XETH() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun open0xBTC() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun openBtcBlockExplorer() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun openEthereumBlockExplorer() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    fun openExceedBlockExplorer() { // for more than one url
        val url = "http://www.example.com"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }


    private val mOnNavigationItemSelectedListener = OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                createWalletFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_exchange -> {
                createexchangeFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {
                createSettingsFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_recieve -> {
                createStartQRFragment()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    fun loadNodeAgain() {
        try {
            val nc = NodeConfig()
            val node1 = Geth.newNode(filesDir.toString() + "/.ethNode1", nc)
            node1.start()
            val gethNode = GethNodeHolder.getInstance()
            gethNode.node = node1

        } catch (e: Exception) {
            Log.e("error: ", e.message)
            e.printStackTrace()
        }
    }

    // on click copy button
    fun copyEthAddress() {
        myClip = ClipData.newPlainText("text", eth_invisible_address.toString());
        myClipboard?.setPrimaryClip(myClip);
        Toast.makeText(this, "Ethereum Address Copied", Toast.LENGTH_SHORT).show();
    }

    fun copyBtcAddress() {
        myClip = ClipData.newPlainText("text", btc_invisible_address.toString());
        myClipboard?.setPrimaryClip(myClip);
        Toast.makeText(this, "Bitcoin Address Copied", Toast.LENGTH_SHORT).show();
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //switch to main activity layout with the smaller fragment container
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        loadUpEthereums()
        myClipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager?;
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentholder, user_wallet_fragment())
        fragmentTransaction.commit()

    }

    fun loadUpEthereums() {

        try {
            val nc = NodeConfig()
            val node1 = Geth.newNode(filesDir.toString() + "/.ethNode1", nc)
            node1.start()
            val gethNode = GethNodeHolder.getInstance()
            gethNode.node = node1
            var ethAddress24 = gethNode.account.address.hex.toString()
            val ethAddressPlugin = (R.id.eth_invisible_address) as TextView
            ethAddressPlugin.setText(ethAddress24)
            val prefs = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putString("ethAddress", ethAddress24)
            editor.commit()

        } catch (e: Exception) {
            Log.e("error: ", e.message)
            e.printStackTrace()
        }
    }


    fun createEthBitmap(imgs : ImageView,msg:String) {

//        val qrCodeWriter = QRCodeWriter()
//        val bitMatrix = qrCodeWriter.encode("Hello from sachin",
//                BarcodeFormat.QR_CODE,
//                216, 216) // width x height
//        val path = FileSystems.getDefault().getPath("ethAddressQRCode.png")
//        val stringed = path.toString()
//        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path)
        imgs.setImageBitmap(textToImageEncode(msg))

    }
    fun createBtcBitmap(imgs1 : ImageView,msg1:String) {

//        val qrCodeWriter = QRCodeWriter()
//        val bitMatrix = qrCodeWriter.encode("Hello from sachin",
//                BarcodeFormat.QR_CODE,
//                216, 216) // width x height
//        val path = FileSystems.getDefault().getPath("ethAddressQRCode.png")
//        val stringed = path.toString()
//        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path)
        imgs1.setImageBitmap(textToImageEncode(msg1))

    }

    @Throws(WriterException::class)
    internal fun textToImageEncode(Value: String): Bitmap? {
        val bitMatrix: BitMatrix
        try {
            bitMatrix = MultiFormatWriter().encode(
                    Value,
                    BarcodeFormat.QR_CODE,
                    216, 216, null
            )

        } catch (Illegalargumentexception: IllegalArgumentException) {

            return null
        }

        val bitMatrixWidth = bitMatrix.width

        val bitMatrixHeight = bitMatrix.height

        val pixels = IntArray(bitMatrixWidth * bitMatrixHeight)

        for (y in 0 until bitMatrixHeight) {
            val offset = y * bitMatrixWidth

            for (x in 0 until bitMatrixWidth) {

                pixels[offset + x] = if (bitMatrix.get(x, y))
                    resources.getColor(R.color.black)
                else
                    resources.getColor(R.color.white)
            }
        }
        val bitmap = Bitmap.createBitmap(bitMatrixWidth, bitMatrixHeight, Bitmap.Config.ARGB_4444)

        bitmap.setPixels(pixels, 0, 216, 0, 0, bitMatrixWidth, bitMatrixHeight)
        return bitmap
    }


}





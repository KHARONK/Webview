     package nmhu.edu.sd_bssd4240hw92_webview


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.*
import androidx.appcompat.widget.LinearLayoutCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this).apply{
           // loadUrl("https://image.tmdb.org/t/p/w500/lszpCmmPCKHvzn2OBx7bAgXlfhC.jpg")
            settings.javaScriptEnabled = true
            layoutParams = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,0,0.9F) }

        val webView1 = WebView(this).apply{
            settings.javaScriptEnabled = true
            layoutParams = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,0,0.9F)
             }

        val loadImg =Button(this).apply{
            text = "Load Image"
            contentDescription = "file:///android_asset/index.html"
            setOnClickListener {
                setText("https://github.com/LiteTJ/connect-four")

                loadInternetDataTo(webView)
            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,0,0.1F)
        }

        val loadAnim =Button(this).apply {
            text = "Load Animation"
            contentDescription = "file:///android_asset/indexx.html"
            setOnClickListener {
                setText("https://github.com/mdn/webgl-examples")
                loadInternetDataTo1(webView1)

            }
            layoutParams = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT, 0, 0.1F
            )
        }

        val linearLayout = LinearLayoutCompat(this).apply{
            layoutParams = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT,)

            orientation = LinearLayoutCompat.VERTICAL
            addView(loadImg)
            addView(webView)
            addView(loadAnim)
            addView(webView1)
            weightSum = 1.0F
        }

        setContentView(linearLayout)
    }
}


    private fun loadInternetDataTo(webView: WebView)
    {

        webView.loadUrl("file:///android_asset/index.html")
    }

  private fun loadInternetDataTo1(webView1: WebView)
   {

    webView1.loadUrl("file:///android_asset/indexx.html")
   }

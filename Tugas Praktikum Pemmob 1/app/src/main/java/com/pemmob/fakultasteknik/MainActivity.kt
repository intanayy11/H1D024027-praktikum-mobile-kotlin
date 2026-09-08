package com.pemmob.fakultasteknik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pemmob.fakultasteknik.ui.theme.FakultasTeknikTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            FakultasTeknikTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    HalamanUtama(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun HalamanUtama(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF121016)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(
                id = R.drawable.gedung_teknik
            ),
            contentDescription = "Gedung Fakultas Teknik",

            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),

            contentScale = ContentScale.Crop
        )

        Text(
            text = "Selamat datang di Prodi Informatika,\n" +
                    "Fakultas Teknik,\n" +
                    "Universitas Jenderal Soedirman",

            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            lineHeight = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)
        )

        // DESKRIPSI
        Text(
            text = "Program Studi Informatika di Universitas Jenderal Soedirman " +
                    "(Unsoed) berdiri pada tahun 2008, berawal dari kebutuhan yang " +
                    "semakin mendesak akan tenaga ahli di bidang teknologi " +
                    "informasi dan komunikasi. Saat itu, perkembangan teknologi " +
                    "yang pesat di Indonesia dan dunia memerlukan adanya program " +
                    "pendidikan tinggi yang mampu mencetak lulusan dengan " +
                    "kompetensi tinggi di bidang informatika.\n" +
                    "Pada tahun tersebut, Fakultas Sains dan Teknik (FST) Unsoed " +
                    "mengambil inisiatif untuk mendirikan Program Studi " +
                    "Informatika. Pembentukan program studi ini bertujuan untuk " +
                    "memenuhi tuntutan masyarakat dan industri yang membutuhkan " +
                    "tenaga profesional dalam bidang teknologi informasi. " +
                    "Kurikulum yang disusun dirancang untuk memberikan pendidikan " +
                    "berkualitas, menggabungkan aspek praktis dan teoritis dari " +
                    "informatika, seperti pemrograman, sistem informasi, jaringan " +
                    "komputer, dan kecerdasan buatan.",

            color = Color.White,
            fontSize = 14.sp,
            lineHeight = 14.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 6.dp,
                    start = 0.dp,
                    end = 0.dp
                )
        )

        Spacer(
            modifier = Modifier.height(4.dp)
        )

        Button(
            onClick = {
            },

            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 0.dp)
                .width(65.dp)
                .height(40.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFE7E7E7),
                contentColor = Color(0xFF5A2A91)
            )
        ) {

            Text(
                text = "NEXT",
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(
            modifier = Modifier.height(20.dp)
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 400,
    heightDp = 640
)
@Composable
fun HalamanUtamaPreview() {

    FakultasTeknikTheme {
        HalamanUtama()
    }
}
package com.example.btvn_tuan3_bai1.Screens

import android.content.Intent
import android.graphics.Color.parseColor
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.btvn_tuan3_bai1.R
import androidx.compose.foundation.text.ClickableText
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale

@Composable
fun ImageScreen(BackMenu:()-> Unit){
    Image1Screen(BackMenu,
            contentScale = ContentScale.Fit)
}

@Composable
fun Image1Screen(BackMenu: () -> Unit, contentScale: ContentScale){

    val context = LocalContext.current  // Dùng để mở trình duyệt

    // Tạo văn bản với liên kết
    val annotatedText = buildAnnotatedString {
        append("Bạn có thể truy cập ")

        // Gán annotation cho phần văn bản "tại đây"
        pushStringAnnotation(
            tag = "URL",                // tên của annotation (bạn tự đặt)
            annotation = "https://portal.ut.edu.vn/"  // giá trị liên kết
        )

        // Định dạng văn bản có link (xanh + gạch chân)
        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline
            )
        ) {
            append("tại đây")  // đây là phần người dùng sẽ click vào
        }

        pop()  // kết thúc annotation

        append(" để xem chi tiết.")  // phần tiếp theo
    }

    //=====================================================
    Column(
        modifier = Modifier
            .padding(top = 40.dp, start = 20.dp, end = 20.dp) // chỉ cách đỉnh điện thoại
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            // Nút back ở bên trái
            IconButton(
                onClick = {BackMenu()},
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }

            // Tiêu đề căn giữa
            Text(
                text = "Images",
                modifier = Modifier.align(Alignment.Center),
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(parseColor("#0099FF"))
                )
            )
        }


        Spacer(modifier = Modifier.height(50.dp))

        Image(
            painter = painterResource(id=R.drawable.tr1)
            , contentDescription = "anh Android"
            , modifier = Modifier
                //tạo bo góc
                .fillMaxWidth()
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(size = 10.dp)
                )
                //tỉ lệ chiều cao và chiều rộng
                .aspectRatio(ratio = 16f / 9f)
            , contentScale = contentScale
            , alignment = Alignment.CenterEnd
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "https://giaothongvantaitphcm.edu.vn/wp=content/uploads/2025/01/Logo-GTVT.png",
            textDecoration = TextDecoration.Underline,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        )

        Spacer(modifier = Modifier.height(50.dp))

        Image(
            painter = painterResource(id=R.drawable.tr2)
            , contentDescription = "anh Android"
            , modifier = Modifier
                //tạo bo góc
                .fillMaxWidth()
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(size = 10.dp)
                )
                //tỉ lệ chiều cao và chiều rộng
                .aspectRatio(ratio = 16f / 9f)
            , contentScale = contentScale
            , alignment = Alignment.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "In app",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        )


        Spacer(modifier = Modifier.height(20.dp))

        // Hiển thị văn bản và xử lý sự kiện khi click
        ClickableText(
            text = annotatedText,
            onClick = { offset ->
                // Kiểm tra nếu người dùng click trúng đoạn có annotation "URL"
                annotatedText.getStringAnnotations(tag = "URL", start = offset, end = offset)
                    .firstOrNull()?.let { stringAnnotation ->
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(stringAnnotation.item))
                        context.startActivity(intent)  // mở link trong trình duyệt
                    }
            }
        )

    }



}
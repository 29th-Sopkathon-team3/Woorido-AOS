package org.sopt.study.woorido.ui

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContentProviderCompat.requireContext
import com.bumptech.glide.Glide
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.sopt.study.woorido.databinding.ActivityJoinProfileBinding
import org.sopt.study.woorido.databinding.ActivityUserJoinBinding
import org.sopt.study.woorido.detail.ui.RankingActivity
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.InputStream

class JoinProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityJoinProfileBinding
    private lateinit var getContent: ActivityResultLauncher<Intent>




    private val requestImage =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { activityResult ->
            val intent = activityResult.data
            if (intent != null) {
                val fileUri = requireNotNull(intent.data)

                Glide.with(this)
                    .load(fileUri)
                    .circleCrop()
                    .into(binding.ivProilePicture)

                val options = BitmapFactory.Options()
                val inputStream: InputStream =
                    requireNotNull(contentResolver.openInputStream(fileUri))
                val bitmap = BitmapFactory.decodeStream(inputStream, null, options)
                val byteArrayOutputStream = ByteArrayOutputStream()
                bitmap!!.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream)
                val fileBody = RequestBody.create(
                    MediaType.parse("image/jpeg"),
                    byteArrayOutputStream.toByteArray()
                )

                val part = MultipartBody.Part.createFormData(
                    "images",
                    File(fileUri.toString()).name,
                    fileBody
                )

            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJoinProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initIntent()

        binding.btnDelete.setOnClickListener {
            binding.etName.setText("")
        }
        binding.btnOk.setOnClickListener {
            val intent2=Intent(this, RankingActivity::class.java)
            startActivity(intent2)
            finish()
        }
    }


    private fun initIntent() {
        binding.ivProilePicture.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK).apply {
                type = MediaStore.Images.Media.CONTENT_TYPE
                type = "image/*"
            }

            requestImage.launch(intent)
        }
    }


}
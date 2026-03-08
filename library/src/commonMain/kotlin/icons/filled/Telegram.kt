package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Telegram: ImageVector
    get() {
        if (_Telegram != null) {
            return _Telegram!!
        }
        _Telegram = ImageVector.Builder(
            name = "Filled.Telegram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.464f, 4.41f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.277f, 0.707f)
                lineToRelative(-2.065f, 13.049f)
                lineToRelative(-0.003f, 0.02f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.064f, 0.343f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.26f, 0.49f)
                arcToRelative(1.06f, 1.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.758f, 0.327f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -0.145f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.296f, -0.186f)
                lineToRelative(-0.018f, -0.011f)
                lineToRelative(-2.467f, -1.649f)
                lineToRelative(-2.353f, 1.921f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.342f, 0.264f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.605f, 0.21f)
                arcToRelative(1.06f, 1.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.836f, -0.39f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.227f, -0.605f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.011f, -0.43f)
                verticalLineToRelative(-0.01f)
                lineToRelative(-0.136f, -3.748f)
                lineToRelative(-5.256f, -1.55f)
                lineToRelative(-0.026f, -0.007f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.504f, -0.16f)
                curveToRelative(-0.11f, -0.043f, -0.402f, -0.156f, -0.577f, -0.44f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.056f, -1.003f)
                curveToRelative(0.143f, -0.303f, 0.42f, -0.447f, 0.525f, -0.501f)
                curveToRelative(0.134f, -0.07f, 0.308f, -0.142f, 0.483f, -0.215f)
                lineToRelative(15.353f, -6.384f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.752f, 0.104f)
                moveTo(10.298f, 13.16f)
                lineToRelative(5.23f, -4.903f)
                lineToRelative(-9.892f, 3.529f)
                close()
                moveTo(17.915f, 8.063f)
                lineTo(11.707f, 13.89f)
                lineTo(14.651f, 15.8f)
                lineTo(17.256f, 17.541f)
                close()
            }
        }.build()

        return _Telegram!!
    }

@Suppress("ObjectPropertyName")
private var _Telegram: ImageVector? = null

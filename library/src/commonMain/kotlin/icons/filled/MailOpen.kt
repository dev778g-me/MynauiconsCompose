package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MailOpen: ImageVector
    get() {
        if (_MailOpen != null) {
            return _MailOpen!!
        }
        _MailOpen = ImageVector.Builder(
            name = "Filled.MailOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.453f, 3.578f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.907f, 0f)
                curveToRelative(-0.311f, 0.065f, -0.62f, 0.227f, -1.514f, 0.724f)
                lineTo(3.8f, 7.767f)
                lineToRelative(5.955f, 3.972f)
                curveToRelative(1.01f, 0.674f, 1.362f, 0.895f, 1.721f, 0.981f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, 0f)
                curveToRelative(0.358f, -0.086f, 0.71f, -0.307f, 1.722f, -0.982f)
                lineToRelative(5.954f, -3.971f)
                lineToRelative(-6.234f, -3.465f)
                curveToRelative(-0.893f, -0.497f, -1.202f, -0.66f, -1.514f, -0.724f)
                moveToRelative(-1.21f, -1.468f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.512f, 0f)
                curveToRelative(0.565f, 0.117f, 1.086f, 0.406f, 1.84f, 0.826f)
                lineToRelative(0.1f, 0.056f)
                lineToRelative(7.308f, 4.062f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.386f, 0.655f)
                verticalLineToRelative(7.02f)
                curveToRelative(0f, 0.814f, 0f, 1.47f, -0.044f, 2f)
                curveToRelative(-0.044f, 0.547f, -0.139f, 1.027f, -0.365f, 1.471f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.639f, 1.639f)
                curveToRelative(-0.444f, 0.226f, -0.924f, 0.32f, -1.47f, 0.365f)
                curveToRelative(-0.532f, 0.044f, -1.187f, 0.044f, -2f, 0.044f)
                horizontalLineTo(7.128f)
                curveToRelative(-0.813f, 0f, -1.469f, 0f, -2f, -0.044f)
                curveToRelative(-0.546f, -0.044f, -1.026f, -0.139f, -1.47f, -0.365f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.64f, -1.639f)
                curveToRelative(-0.226f, -0.444f, -0.32f, -0.924f, -0.365f, -1.47f)
                curveToRelative(-0.043f, -0.532f, -0.043f, -1.187f, -0.043f, -2f)
                verticalLineTo(7.71f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.385f, -0.656f)
                lineTo(9.303f, 2.99f)
                quadToRelative(0.051f, -0.03f, 0.101f, -0.056f)
                curveToRelative(0.754f, -0.42f, 1.275f, -0.71f, 1.84f, -0.826f)
            }
        }.build()

        return _MailOpen!!
    }

@Suppress("ObjectPropertyName")
private var _MailOpen: ImageVector? = null

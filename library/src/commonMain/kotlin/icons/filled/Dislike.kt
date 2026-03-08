package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Dislike: ImageVector
    get() {
        if (_Dislike != null) {
            return _Dislike!!
        }
        _Dislike = ImageVector.Builder(
            name = "Filled.Dislike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.193f, 20.928f)
                arcToRelative(1.62f, 1.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.415f, 0.822f)
                curveToRelative(-1.005f, 0f, -1.773f, -0.38f, -2.282f, -1.048f)
                curveToRelative(-0.477f, -0.628f, -0.664f, -1.43f, -0.723f, -2.189f)
                curveToRelative(-0.106f, -1.37f, 0.188f, -2.908f, 0.404f, -3.868f)
                horizontalLineToRelative(-5.25f)
                curveToRelative(-0.661f, 0f, -1.117f, -0.389f, -1.364f, -0.882f)
                curveToRelative(-0.225f, -0.446f, -0.301f, -1.004f, -0.312f, -1.556f)
                curveToRelative(-0.021f, -1.124f, 0.23f, -2.564f, 0.607f, -3.956f)
                curveToRelative(0.38f, -1.4f, 0.902f, -2.813f, 1.459f, -3.893f)
                curveToRelative(0.276f, -0.536f, 0.577f, -1.02f, 0.894f, -1.383f)
                curveToRelative(0.28f, -0.321f, 0.725f, -0.725f, 1.304f, -0.725f)
                horizontalLineToRelative(12.521f)
                curveToRelative(0.935f, 0f, 1.714f, 0.748f, 1.714f, 1.697f)
                verticalLineToRelative(9.385f)
                curveToRelative(0f, 0.628f, -0.349f, 1.199f, -0.898f, 1.493f)
                moveToRelative(0f, 0f)
                curveToRelative(-0.39f, 0.21f, -0.773f, 0.402f, -1.148f, 0.591f)
                curveToRelative(-0.68f, 0.343f, -1.335f, 0.673f, -1.973f, 1.07f)
                curveToRelative(-0.958f, 0.596f, -1.746f, 1.27f, -2.258f, 2.176f)
                lineToRelative(-1.28f, 2.266f)
            }
        }.build()

        return _Dislike!!
    }

@Suppress("ObjectPropertyName")
private var _Dislike: ImageVector? = null

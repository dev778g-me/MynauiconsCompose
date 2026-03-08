package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Cannabis: ImageVector
    get() {
        if (_Cannabis != null) {
            return _Cannabis!!
        }
        _Cannabis = ImageVector.Builder(
            name = "Filled.Cannabis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.25f, 21.5f)
                verticalLineToRelative(-3.992f)
                lineToRelative(-2.233f, 0.67f)
                curveToRelative(-1.884f, 0.565f, -3.308f, -0.324f, -4.441f, -1.228f)
                lineToRelative(-0.469f, -0.385f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.241f, -2.078f)
                lineToRelative(2.385f, -1.193f)
                lineToRelative(-2.766f, -2.766f)
                curveToRelative(-0.903f, -0.903f, -0.03f, -2.39f, 1.163f, -2.103f)
                lineToRelative(0.117f, 0.033f)
                lineToRelative(4.665f, 1.555f)
                lineToRelative(1.35f, -7.643f)
                lineToRelative(0.034f, -0.13f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.443f, 0.13f)
                lineToRelative(1.347f, 7.643f)
                lineToRelative(4.667f, -1.555f)
                lineToRelative(0.117f, -0.033f)
                curveToRelative(1.193f, -0.287f, 2.066f, 1.2f, 1.163f, 2.103f)
                lineToRelative(-2.768f, 2.766f)
                lineToRelative(2.387f, 1.193f)
                lineToRelative(0.142f, 0.083f)
                curveToRelative(0.631f, 0.425f, 0.736f, 1.323f, 0.22f, 1.881f)
                lineToRelative(-0.12f, 0.114f)
                curveToRelative(-1.168f, 0.973f, -2.66f, 2.181f, -4.71f, 1.668f)
                lineToRelative(-0.201f, -0.055f)
                lineToRelative(-2.233f, -0.67f)
                verticalLineTo(21.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
            }
        }.build()

        return _Cannabis!!
    }

@Suppress("ObjectPropertyName")
private var _Cannabis: ImageVector? = null

package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Lightning: ImageVector
    get() {
        if (_Lightning != null) {
            return _Lightning!!
        }
        _Lightning = ImageVector.Builder(
            name = "Outline.Lightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.564f, 13.708f)
                arcToRelative(0.504f, 0.504f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.496f, -0.565f)
                horizontalLineTo(7f)
                arcToRelative(0.506f, 0.506f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.461f, -0.702f)
                lineToRelative(3.907f, -9.128f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, -0.313f)
                horizontalLineToRelative(4.518f)
                curveToRelative(0.353f, 0f, 0.594f, 0.36f, 0.465f, 0.694f)
                lineToRelative(-2.225f, 5.712f)
                arcToRelative(0.506f, 0.506f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.464f, 0.694f)
                horizontalLineTo(17f)
                curveToRelative(0.412f, 0f, 0.647f, 0.479f, 0.398f, 0.813f)
                lineToRelative(-7.47f, 10.046f)
                curveToRelative(-0.062f, 0.083f, -0.191f, 0.03f, -0.18f, -0.072f)
                close()
            }
        }.build()

        return _Lightning!!
    }

@Suppress("ObjectPropertyName")
private var _Lightning: ImageVector? = null

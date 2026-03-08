package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Webcam: ImageVector
    get() {
        if (_Webcam != null) {
            return _Webcam!!
        }
        _Webcam = ImageVector.Builder(
            name = "Outline.Webcam",
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
                moveTo(12f, 17.4f)
                arcTo(7.2f, 7.2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 3f)
                arcToRelative(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.4f)
                moveToRelative(0f, 0f)
                verticalLineTo(21f)
                moveToRelative(-4.5f, 0f)
                horizontalLineToRelative(9f)
                moveToRelative(-1.8f, -10.8f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.4f, 0f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 0f)
            }
        }.build()

        return _Webcam!!
    }

@Suppress("ObjectPropertyName")
private var _Webcam: ImageVector? = null

package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CheckCircleOne: ImageVector
    get() {
        if (_CheckCircleOne != null) {
            return _CheckCircleOne!!
        }
        _CheckCircleOne = ImageVector.Builder(
            name = "Outline.CheckCircleOne",
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
                moveToRelative(9f, 8.806f)
                lineToRelative(3.562f, 3.94f)
                arcToRelative(0.788f, 0.788f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.206f, -0.055f)
                lineTo(21f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, -9f)
            }
        }.build()

        return _CheckCircleOne!!
    }

@Suppress("ObjectPropertyName")
private var _CheckCircleOne: ImageVector? = null

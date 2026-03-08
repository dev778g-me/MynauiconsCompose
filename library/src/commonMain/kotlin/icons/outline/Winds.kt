package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Winds: ImageVector
    get() {
        if (_Winds != null) {
            return _Winds!!
        }
        _Winds = ImageVector.Builder(
            name = "Outline.Winds",
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
                moveTo(16.5f, 7f)
                curveToRelative(3.485f, 0f, 3.485f, 5f, 0f, 5f)
                horizontalLineTo(3f)
                moveToRelative(15.411f, 8f)
                curveToRelative(3.452f, 0f, 3.452f, -5f, 0f, -5f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.411f, 19f)
                curveToRelative(3.452f, 0f, 3.452f, -4f, 0f, -4f)
                horizontalLineTo(3f)
                moveToRelative(7.872f, -11f)
                curveToRelative(3.506f, 0f, 3.506f, 5f, 0f, 5f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.872f, 5f)
                curveToRelative(3.506f, 0f, 3.506f, 4f, 0f, 4f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Winds!!
    }

@Suppress("ObjectPropertyName")
private var _Winds: ImageVector? = null

package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.WindArrowDown: ImageVector
    get() {
        if (_WindArrowDown != null) {
            return _WindArrowDown!!
        }
        _WindArrowDown = ImageVector.Builder(
            name = "Outline.WindArrowDown",
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
                moveToRelative(6.966f, 11.136f)
                lineToRelative(-0.004f, 8f)
                moveToRelative(3.182f, -2.318f)
                lineTo(6.962f, 20f)
                lineTo(3.78f, 16.818f)
                moveTo(18.325f, 7f)
                curveToRelative(3.485f, 0f, 3.485f, 5f, 0f, 5f)
                horizontalLineTo(10f)
                moveToRelative(8.411f, 9f)
                curveToRelative(3.452f, 0f, 3.452f, -5f, 0f, -5f)
                horizontalLineTo(13f)
                moveTo(10.872f, 3f)
                curveToRelative(3.506f, 0f, 3.506f, 5f, 0f, 5f)
                horizontalLineTo(3f)
            }
        }.build()

        return _WindArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _WindArrowDown: ImageVector? = null

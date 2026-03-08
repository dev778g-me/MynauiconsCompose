package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CalendarOff: ImageVector
    get() {
        if (_CalendarOff != null) {
            return _CalendarOff!!
        }
        _CalendarOff = ImageVector.Builder(
            name = "Outline.CalendarOff",
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
                moveTo(7.5f, 5f)
                verticalLineTo(3f)
                moveTo(3.25f, 8f)
                horizontalLineTo(11f)
                moveToRelative(9.75f, 0f)
                horizontalLineTo(16f)
                moveToRelative(-1.4f, -4f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, 0.412f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.748f, 1.65f)
                curveTo(3f, 6.872f, 3f, 7.93f, 3f, 10.045f)
                verticalLineToRelative(4.912f)
                curveToRelative(0f, 0.827f, 0f, 1.492f, 0.026f, 2.044f)
                moveTo(3f, 21f)
                lineToRelative(1.138f, -1.138f)
                moveTo(21f, 3f)
                lineToRelative(-1.692f, 1.692f)
                moveToRelative(0f, 0f)
                curveToRelative(0.528f, 0.352f, 0.96f, 0.822f, 1.256f, 1.37f)
                curveToRelative(0.436f, 0.81f, 0.436f, 1.868f, 0.436f, 3.983f)
                verticalLineToRelative(4.912f)
                curveToRelative(0f, 2.115f, 0f, 3.173f, -0.436f, 3.981f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, 1.651f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.412f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.046f, -0.726f)
                moveToRelative(15.17f, -15.17f)
                lineTo(16f, 8f)
                moveToRelative(0f, 0f)
                lineTo(4.138f, 19.862f)
            }
        }.build()

        return _CalendarOff!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarOff: ImageVector? = null

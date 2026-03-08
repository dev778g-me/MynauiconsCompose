package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CalendarPlus: ImageVector
    get() {
        if (_CalendarPlus != null) {
            return _CalendarPlus!!
        }
        _CalendarPlus = ImageVector.Builder(
            name = "Outline.CalendarPlus",
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
                moveTo(16.5f, 5f)
                verticalLineTo(3f)
                moveToRelative(-9f, 2f)
                verticalLineTo(3f)
                moveTo(3.25f, 8f)
                horizontalLineToRelative(17.5f)
                moveTo(10f, 14f)
                horizontalLineToRelative(4f)
                moveToRelative(-2f, -2f)
                verticalLineToRelative(4f)
                moveToRelative(-9f, -5.956f)
                curveToRelative(0f, -2.115f, 0f, -3.173f, 0.436f, -3.981f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, -1.651f)
                curveTo(6.04f, 4f, 7.16f, 4f, 9.4f, 4f)
                horizontalLineToRelative(5.2f)
                curveToRelative(2.24f, 0f, 3.36f, 0f, 4.216f, 0.412f)
                curveToRelative(0.753f, 0.362f, 1.364f, 0.94f, 1.748f, 1.65f)
                curveToRelative(0.436f, 0.81f, 0.436f, 1.868f, 0.436f, 3.983f)
                verticalLineToRelative(4.912f)
                curveToRelative(0f, 2.115f, 0f, 3.173f, -0.436f, 3.981f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, 1.651f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.412f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.65f)
                curveTo(3f, 18.128f, 3f, 17.07f, 3f, 14.955f)
                close()
            }
        }.build()

        return _CalendarPlus!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarPlus: ImageVector? = null

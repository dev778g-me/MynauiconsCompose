package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BookOpen: ImageVector
    get() {
        if (_BookOpen != null) {
            return _BookOpen!!
        }
        _BookOpen = ImageVector.Builder(
            name = "Outline.BookOpen",
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
                moveTo(12f, 9.8f)
                verticalLineTo(20f)
                moveToRelative(0f, -10.2f)
                curveToRelative(0f, -1.704f, 0.107f, -3.584f, -1.638f, -4.473f)
                curveTo(9.72f, 5f, 8.88f, 5f, 7.2f, 5f)
                horizontalLineTo(4.6f)
                curveTo(3.364f, 5f, 3f, 5.437f, 3f, 6.6f)
                verticalLineToRelative(8.8f)
                curveToRelative(0f, 0.568f, -0.036f, 1.195f, 0.546f, 1.491f)
                curveToRelative(0.214f, 0.109f, 0.493f, 0.109f, 1.052f, 0.109f)
                horizontalLineTo(7.43f)
                curveToRelative(2.377f, 0f, 3.26f, 1.036f, 4.569f, 3f)
                moveToRelative(0f, -10.2f)
                curveToRelative(0f, -1.704f, -0.108f, -3.584f, 1.638f, -4.473f)
                curveTo(14.279f, 5f, 15.12f, 5f, 16.8f, 5f)
                horizontalLineToRelative(2.6f)
                curveToRelative(1.235f, 0f, 1.6f, 0.436f, 1.6f, 1.6f)
                verticalLineToRelative(8.8f)
                curveToRelative(0f, 0.567f, 0.035f, 1.195f, -0.546f, 1.491f)
                curveToRelative(-0.213f, 0.109f, -0.493f, 0.109f, -1.052f, 0.109f)
                horizontalLineToRelative(-2.833f)
                curveToRelative(-2.377f, 0f, -3.26f, 1.036f, -4.57f, 3f)
            }
        }.build()

        return _BookOpen!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpen: ImageVector? = null

package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AlarmSmoke: ImageVector
    get() {
        if (_AlarmSmoke != null) {
            return _AlarmSmoke!!
        }
        _AlarmSmoke = ImageVector.Builder(
            name = "Outline.AlarmSmoke",
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
                moveTo(17.32f, 12.053f)
                curveToRelative(3.111f, 3.728f, -3.111f, 5.22f, 0f, 8.947f)
                moveTo(12f, 12.053f)
                curveToRelative(3.111f, 3.728f, -3.111f, 5.22f, 0f, 8.947f)
                moveToRelative(-5.32f, -8.947f)
                curveToRelative(3.111f, 3.728f, -3.111f, 5.22f, 0f, 8.947f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                moveToRelative(12.444f, 0f)
                curveToRelative(0f, 3.118f, -1.949f, 5.964f, -5.444f, 5.964f)
                reflectiveCurveTo(6.556f, 6.118f, 6.556f, 3f)
            }
        }.build()

        return _AlarmSmoke!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmSmoke: ImageVector? = null

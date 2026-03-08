package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Euro: ImageVector
    get() {
        if (_Euro != null) {
            return _Euro!!
        }
        _Euro = ImageVector.Builder(
            name = "Outline.Euro",
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
                moveTo(14f, 10f)
                horizontalLineTo(7.12f)
                moveToRelative(0f, 0f)
                horizontalLineTo(4f)
                moveToRelative(3.12f, 0f)
                curveToRelative(0.55f, -4.254f, 3.01f, -6f, 7.38f, -6f)
                curveToRelative(2.418f, 0f, 4.251f, 0.535f, 5.5f, 1.733f)
                moveTo(7.12f, 10f)
                quadTo(7f, 10.92f, 7f, 12f)
                reflectiveQuadToRelative(0.12f, 2f)
                moveTo(14f, 14f)
                horizontalLineTo(7.12f)
                moveToRelative(0f, 0f)
                horizontalLineTo(4f)
                moveToRelative(3.12f, 0f)
                curveToRelative(0.55f, 4.254f, 3.01f, 6f, 7.38f, 6f)
                curveToRelative(2.418f, 0f, 4.251f, -0.535f, 5.5f, -1.733f)
            }
        }.build()

        return _Euro!!
    }

@Suppress("ObjectPropertyName")
private var _Euro: ImageVector? = null

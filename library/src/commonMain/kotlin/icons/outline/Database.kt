package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Database: ImageVector
    get() {
        if (_Database != null) {
            return _Database!!
        }
        _Database = ImageVector.Builder(
            name = "Outline.Database",
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
                moveTo(12f, 3f)
                curveTo(7.582f, 3f, 4f, 4.29f, 4f, 5.88f)
                curveToRelative(0f, 4.16f, 16f, 4.16f, 16f, 0f)
                curveTo(20f, 4.29f, 16.418f, 3f, 12f, 3f)
                moveToRelative(8f, 8.75f)
                curveToRelative(0f, 4.667f, -16f, 4.667f, -16f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                verticalLineToRelative(12.165f)
                curveToRelative(0f, 3.78f, 16f, 3.78f, 16f, 0f)
                verticalLineTo(6f)
            }
        }.build()

        return _Database!!
    }

@Suppress("ObjectPropertyName")
private var _Database: ImageVector? = null

package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Trees: ImageVector
    get() {
        if (_Trees != null) {
            return _Trees!!
        }
        _Trees = ImageVector.Builder(
            name = "Outline.Trees",
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
                moveTo(15f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                lineToRelative(-3.5f, -4.5f)
                horizontalLineToRelative(3f)
                lineTo(15f, 5f)
                lineToRelative(-2f, 2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 17f)
                horizontalLineToRelative(7f)
                lineToRelative(-4.5f, -6.5f)
                horizontalLineToRelative(3f)
                lineTo(10f, 3f)
                lineToRelative(-5.5f, 7.5f)
                horizontalLineToRelative(3f)
                lineTo(3f, 17f)
                close()
                moveTo(10f, 17f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _Trees!!
    }

@Suppress("ObjectPropertyName")
private var _Trees: ImageVector? = null

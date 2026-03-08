package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FireExtinguisher: ImageVector
    get() {
        if (_FireExtinguisher != null) {
            return _FireExtinguisher!!
        }
        _FireExtinguisher = ImageVector.Builder(
            name = "Outline.FireExtinguisher",
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
                moveTo(14.5f, 6.5f)
                verticalLineTo(3f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, -1f)
                moveToRelative(-3f, 1f)
                curveToRelative(0f, -0.545f, -0.455f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.545f, 0f, -1f, 0.455f, -1f, 1f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(3.5f)
                moveToRelative(0f, -3.5f)
                curveToRelative(-3.963f, 0f, -5f, 2.39f, -5f, 6f)
                moveToRelative(3f, 9f)
                horizontalLineToRelative(8f)
                moveToRelative(-2f, -14f)
                lineToRelative(3f, 1f)
                moveToRelative(-1f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.09f, -0.91f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.09f, 0f, -2f, -0.91f, -2f, -2f)
                verticalLineTo(10f)
                curveToRelative(0f, -4.93f, 8f, -5.227f, 8f, 0f)
            }
        }.build()

        return _FireExtinguisher!!
    }

@Suppress("ObjectPropertyName")
private var _FireExtinguisher: ImageVector? = null

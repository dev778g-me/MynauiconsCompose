package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TentTree: ImageVector
    get() {
        if (_TentTree != null) {
            return _TentTree!!
        }
        _TentTree = ImageVector.Builder(
            name = "Outline.TentTree",
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
                moveTo(5f, 20.75f)
                verticalLineToRelative(-10f)
                curveToRelative(2.809f, -1.248f, 4.986f, -2.583f, 7f, -5f)
                curveToRelative(2.014f, 2.417f, 4.191f, 3.752f, 7f, 5f)
                verticalLineToRelative(10f)
                moveToRelative(-14f, 0f)
                horizontalLineTo(3f)
                moveToRelative(2f, 0f)
                horizontalLineToRelative(2.5f)
                moveToRelative(11.5f, 0f)
                horizontalLineToRelative(2f)
                moveToRelative(-2f, 0f)
                horizontalLineToRelative(-2.5f)
                moveToRelative(-9f, 0f)
                horizontalLineToRelative(9f)
                moveToRelative(-9f, 0f)
                curveToRelative(2.586f, -2.586f, 4.031f, -5.406f, 4.5f, -9f)
                curveToRelative(0.469f, 3.594f, 1.914f, 6.414f, 4.5f, 9f)
                moveTo(6f, 10f)
                verticalLineTo(3.5f)
                moveToRelative(-2f, 0.783f)
                lineToRelative(1.553f, -0.69f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.894f, 0f)
                lineTo(8f, 4.284f)
                moveTo(4f, 6.948f)
                lineToRelative(1.553f, -0.69f)
                curveToRelative(0.281f, -0.125f, 0.613f, -0.125f, 0.894f, 0f)
                lineTo(8f, 6.948f)
                moveTo(18f, 10f)
                verticalLineTo(5f)
                moveToRelative(0f, 0f)
                curveToRelative(-0.153f, 0f, -0.306f, 0.031f, -0.447f, 0.094f)
                lineTo(16f, 5.784f)
                moveTo(18f, 5f)
                curveToRelative(0.153f, 0f, 0.306f, 0.031f, 0.447f, 0.094f)
                lineToRelative(1.553f, 0.69f)
            }
        }.build()

        return _TentTree!!
    }

@Suppress("ObjectPropertyName")
private var _TentTree: ImageVector? = null

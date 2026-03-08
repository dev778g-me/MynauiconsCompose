package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FilterOne: ImageVector
    get() {
        if (_FilterOne != null) {
            return _FilterOne!!
        }
        _FilterOne = ImageVector.Builder(
            name = "Outline.FilterOne",
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
                moveTo(10.046f, 17.676f)
                verticalLineToRelative(-3.918f)
                curveToRelative(0f, -0.554f, 0f, -0.832f, -0.05f, -1.1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.219f, -0.686f)
                curveToRelative(-0.114f, -0.247f, -0.274f, -0.474f, -0.595f, -0.926f)
                lineTo(5.935f, 6.467f)
                curveToRelative(-0.566f, -0.797f, -0.849f, -1.196f, -0.836f, -1.529f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, -0.735f)
                curveTo(5.743f, 4f, 6.232f, 4f, 7.21f, 4f)
                horizontalLineToRelative(9.581f)
                curveToRelative(0.978f, 0f, 1.467f, 0f, 1.73f, 0.203f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, 0.735f)
                curveToRelative(0.014f, 0.333f, -0.27f, 0.732f, -0.835f, 1.53f)
                lineToRelative(-3.247f, 4.578f)
                curveToRelative(-0.32f, 0.452f, -0.481f, 0.679f, -0.595f, 0.926f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.22f, 0.687f)
                curveToRelative(-0.05f, 0.267f, -0.05f, 0.544f, -0.05f, 1.1f)
                verticalLineToRelative(5.871f)
                moveToRelative(-3.907f, -1.954f)
                curveToRelative(1.654f, -0.732f, 3.908f, -0.296f, 3.908f, 1.954f)
                moveToRelative(-3.908f, -1.954f)
                curveToRelative(-0.033f, 2.235f, 2.262f, 2.792f, 3.908f, 1.954f)
            }
        }.build()

        return _FilterOne!!
    }

@Suppress("ObjectPropertyName")
private var _FilterOne: ImageVector? = null
